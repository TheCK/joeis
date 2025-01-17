package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033382 a(n) = floor(62/n).
 * @author Sean A. Irvine
 */
public class A033382 implements Sequence {

  private static final Z NUM = Z.valueOf(62);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

