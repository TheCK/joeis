package irvine.oeis.a023;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023789 Katadromes: digits in base 7 are in strict descending order.
 * @author Sean A. Irvine
 */
public class A023789 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.ZERO);
    mA.add(Z.ONE);
    mA.add(Z.TWO);
    mA.add(Z.THREE);
    mA.add(Z.FOUR);
    mA.add(Z.FIVE);
    mA.add(Z.SIX);
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      return null;
    }
    final Z a = mA.pollFirst();
    final Z b = a.multiply(7);
    for (long k = a.mod(7) - 1; k >= 0; --k) {
      mA.add(b.add(k));
    }
    return a;
  }
}

