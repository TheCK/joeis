package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030419 Length of n-th run of digit 0 in A030413.
 * @author Sean A. Irvine
 */
public class A030419 extends A030413 {

  @Override
  public Z next() {
    while (!Z.ZERO.equals(super.next())) {
      // do nothing
    }
    long cnt = 1;
    while (Z.ZERO.equals(super.next())) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

