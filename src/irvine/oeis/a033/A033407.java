package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033407 a(n) = floor(87/n).
 * @author Sean A. Irvine
 */
public class A033407 implements Sequence {

  private static final Z NUM = Z.valueOf(87);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

