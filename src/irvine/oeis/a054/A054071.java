package irvine.oeis.a054;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.Sort;

/**
 * A054071 Position of 1 in the permutation of 1,2,...,n obtained by ordering the fractional parts {h*sqrt(2)} for h=1,2,...,n.
 * @author Sean A. Irvine
 */
public class A054071 implements Sequence {

  private static final double SQRT2 = Math.sqrt(2);
  private long[] mP = new long[0];

  @Override
  public Z next() {
    mP = Arrays.copyOf(mP, mP.length + 1);
    mP[mP.length - 1] = mP.length;
    final double[] t = new double[mP.length];
    for (int k = 0; k < t.length; ++k) {
      t[k] = (mP[k] * SQRT2) % 1;
    }
    Sort.sort(t, mP);
    for (int k = 0; true; ++k) {
      if (mP[k] == 1) {
        return Z.valueOf(k + 1);
      }
    }
  }
}
