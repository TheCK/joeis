package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033407 <code>[ 87/n ]</code>.
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

