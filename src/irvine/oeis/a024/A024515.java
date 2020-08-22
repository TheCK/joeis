package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000404;

/**
 * A024515 Positions of even numbers in A000404 (sums of 2 nonzero squares).
 * @author Sean A. Irvine
 */
public class A024515 extends A000404 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().isEven()) {
        return Z.valueOf(mN);
      }
    }
  }
}

