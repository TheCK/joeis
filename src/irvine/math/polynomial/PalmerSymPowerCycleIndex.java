package irvine.math.polynomial;

import java.util.Map;

import irvine.math.IntegerUtils;
import irvine.math.MemoryFunction2;
import irvine.math.group.PolynomialRingField;
import irvine.math.group.SymmetricGroup;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * Symmetric cycle indices <code>Z(S_n^{(m)})</code>.
 * @author Sean A. Irvine
 */
public final class PalmerSymPowerCycleIndex extends MemoryFunction2<Integer, Q> {

  private int b(final int n, final int m) {
    return Binomial.binomial(n, m).intValueExact();
  }

  private MultivariateMonomial m1(final MultivariateMonomial a) {
    final MultivariateMonomial m = new MultivariateMonomial();
    for (final Map.Entry<Pair<String, Integer>, Z> e : a.entrySet()) {
      final int k = e.getKey().right();
      final int jk = e.getValue().intValueExact();
      if (k % 3 == 0) {
        m.add(k / 3, jk);
        m.add(k, jk * k * (k - 3L) / 6);
      } else {
        m.add(k, jk * b(k, 3) / k);
      }
    }
    return m;
  }

  private MultivariateMonomial m2(final MultivariateMonomial a) {
    final MultivariateMonomial r = new MultivariateMonomial();
    for (final Map.Entry<Pair<String, Integer>, Z> e : a.entrySet()) {
      final int k = e.getKey().right();
      final int jk = e.getValue().intValueExact();
      r.add(k, k * (k - 1L) * b(jk, 2));
      for (final Map.Entry<Pair<String, Integer>, Z> f : a.entrySet()) {
        final int m = f.getKey().right();
        if (m != k) {
          final int jm = f.getValue().intValueExact();
          final int jj = jk * jm;
          if ((k & 1) == 1) {
            r.add(IntegerUtils.lcm(k, m), jj * IntegerUtils.gcd(k, m) * (k - 1L) / 2);
          } else {
            r.add(IntegerUtils.lcm(k / 2, m), jj * (long) IntegerUtils.gcd(k / 2, m));
            r.add(IntegerUtils.lcm(k, m), jj * IntegerUtils.gcd(k, m) * (k - 2L) / 2);
          }
        }
      }
    }
    return r;
  }

  private MultivariateMonomial m3(final MultivariateMonomial a) {
    final MultivariateMonomial r = new MultivariateMonomial();
    for (final Map.Entry<Pair<String, Integer>, Z> e : a.entrySet()) {
      final int k = e.getKey().right();
      final int jk = e.getValue().intValueExact();
      r.add(k, k * k * b(jk, 3));
      for (final Map.Entry<Pair<String, Integer>, Z> f : a.entrySet()) {
        final int m = f.getKey().right();
        if (m != k) {
          final int jm = f.getValue().intValueExact();
          final int km = k * m;
          final int gcdkm = IntegerUtils.gcd(k, m);
          final int lcmkm = IntegerUtils.lcm(k, m);
          r.add(lcmkm, m * gcdkm * b(jm, 2) * jk);
          if (k < m) {
            for (final Map.Entry<Pair<String, Integer>, Z> g : a.entrySet()) {
              final int t = g.getKey().right();
              if (m < t) {
                final int jt = g.getValue().intValueExact();
                final int lcm = IntegerUtils.lcm(lcmkm, t);
                r.add(lcm, jk * jm * jt * km * t / lcm);
              }
            }
          }
        }
      }
    }
    return r;
  }

  private MultivariateMonomial triple(final MultivariateMonomial a) {
    final MultivariateMonomial m = m1(a);
    m.multiply(m2(a));
    m.multiply(m3(a));
    m.setCoefficient(a.getCoefficient());
    return m;
  }

  private CycleIndex triple(final CycleIndex c) {
    final CycleIndex r = new CycleIndex(c.getName() + "^(3)");
    for (final MultivariateMonomial m : c.values()) {
      r.add(triple(m));
    }
    return r;
  }

  /**
   * Compute <code>Z(S_p^{(n)}</code>.
   * @param n power
   * @param p base
   * @return cycle index
   */
  public CycleIndex cycleIndex(final int n, final int p) {
    final CycleIndex sp = SymmetricGroup.create(p).cycleIndex();
    switch (n) {
      case 1:
        return sp;
      case 2:
        return sp.op(PairMultiply.OP, sp);
      case 3:
        return triple(sp);
      default:
        // A003190 actually only uses n == 2 case
        throw new UnsupportedOperationException();
    }
  }

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);

  @Override
  protected Q compute(final Integer n, final Integer p) {
    return RING.eval(cycleIndex(n + 1, p).applyOnePlusXToTheN(), Q.ONE);
  }
}
