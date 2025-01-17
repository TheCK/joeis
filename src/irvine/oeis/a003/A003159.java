package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003159 Numbers n whose binary representation ends in an even number of zeros.
 * @author Sean A. Irvine
 */
public class A003159 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if ((Long.numberOfTrailingZeros(mN) & 1) == 0) {
        return Z.valueOf(mN);
      }
    }
  }

}
