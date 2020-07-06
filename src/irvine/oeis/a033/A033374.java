package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033374 <code>[ 54/n ]</code>.
 * @author Sean A. Irvine
 */
public class A033374 implements Sequence {

  private static final Z NUM = Z.valueOf(54);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

