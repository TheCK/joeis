package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005102 Minimal determinant of <code>any</code> n-dimensional norm 2 lattice.
 * @author Sean A. Irvine
 */
public class A005102 implements Sequence {

  private static final int[] VALUES = {1, 2, 3, 4, 4, 4, 3, 2, 1, 2, 3, 2, 1, 2};
  private int mN = 0;

  @Override
  public Z next() {
    return mN >= VALUES.length ? Z.ONE : Z.valueOf(VALUES[mN++]);
  }
}
