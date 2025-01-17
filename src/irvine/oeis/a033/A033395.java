package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033395 a(n) = floor(75/n).
 * @author Sean A. Irvine
 */
public class A033395 implements Sequence {

  private static final Z NUM = Z.valueOf(75);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

