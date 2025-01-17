package irvine.oeis.a276;

import irvine.factor.factor.Cheetah;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.a081.A081720;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A276550 Array read by antidiagonals: T(n,k) = number of primitive (period n) bracelets using a maximum of k different colored beads.
 * T(n,k) = number of primitive (period n) bracelets using a maximum of k different colored beads.
 * T(n, k) = Sum_{d|n} mu(n/d) * A081720(d,k) for k&lt;=n
 * @author Georg Fischer
 */
public class A276550 extends UpperLeftTriangle {

  protected A081720 mA081720 = new A081720();

  /** Construct the sequence. */
  public A276550() {
    super(1, 1, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(n).divisors()) {
      final int d = dd.intValue();
      final Z term = mA081720.compute(d - 1, k - 1).multiply(Mobius.mobius(n / d));
      sum = sum.add(term);
    }
    return sum;
  }
}
