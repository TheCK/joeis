package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033426 a(n) = floor(10^6/n).
 * @author Sean A. Irvine
 */
public class A033426 implements Sequence {

  private static final Z NUM = Z.valueOf(1000000);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

