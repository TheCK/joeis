package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033405 <code>[ 85/n ]</code>.
 * @author Sean A. Irvine
 */
public class A033405 implements Sequence {

  private static final Z NUM = Z.valueOf(85);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

