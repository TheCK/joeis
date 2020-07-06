package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033353 <code>[ 33/n ]</code>.
 * @author Sean A. Irvine
 */
public class A033353 implements Sequence {

  private static final Z NUM = Z.valueOf(33);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

