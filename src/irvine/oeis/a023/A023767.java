package irvine.oeis.a023;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023767 Nialpdromes: digits in base 12 are in nonincreasing order.
 * @author Sean A. Irvine
 */
public class A023767 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      for (long k = 1; k < 12; ++k) {
        mA.add(Z.valueOf(k));
      }
      return Z.ZERO;
    }
    final Z a = mA.pollFirst();
    final Z b = a.multiply(12);
    for (long k = a.mod(12); k >= 0; --k) {
      mA.add(b.add(k));
    }
    return a;
  }
}

