package irvine.oeis.a025;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025600 Number of n-move knight paths on 8 X 8 board from given corner to same corner.
 * @author Sean A. Irvine
 */
public class A025600 extends MemoryFunctionInt3<Z> implements Sequence {

  // After Alois P. Heinz

  private int mN = -1;

  @Override
  protected Z compute(final int n, final int i, final int j) {
    if (n < 0 || i < 0 || i > 7 || j < 0 || j > 7) {
      return Z.ZERO;
    }
    if (n == 0 && i == 0 && j == 0) {
      return Z.ONE;
    }
    return get(n - 1, i + 1, j + 2)
      .add(get(n - 1, i + 1, j - 2))
      .add(get(n - 1, i - 1, j + 2))
      .add(get(n - 1, i - 1, j - 2))
      .add(get(n - 1, i + 2, j - 1))
      .add(get(n - 1, i + 2, j + 1))
      .add(get(n - 1, i - 2, j - 1))
      .add(get(n - 1, i - 2, j + 1));
  }

  @Override
  public Z next() {
    return get(++mN, 0, 0);
  }
}
