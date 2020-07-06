package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033397 <code>[ 77/n ]</code>.
 * @author Sean A. Irvine
 */
public class A033397 implements Sequence {

  private static final Z NUM = Z.valueOf(77);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

