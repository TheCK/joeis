package irvine.oeis.a053;

import java.util.Arrays;

import irvine.math.IntegerUtils;
import irvine.math.MemoryFunctionInt3;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053195 Number of level permutations of degree n.
 * @author Sean A. Irvine
 */
public class A053195 extends MemoryFunctionInt3<Z> implements Sequence {

  // After Alois P. Heinz

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;

  @Override
  protected Z compute(final int n, final int i, final int p) {
    if (n == 0) {
      return Z.ONE;
    }
    if (i < 1) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (int j = 0; j <= n / i; ++j) {
      final int[] bottom = new int[j + 1];
      Arrays.fill(bottom, i);
      bottom[0] = n - i * j;
      sum = sum.add(Binomial.multinomial(n, bottom).multiply(mF.factorial(i - 1).pow(j)).multiply(get(n - i * j, i - 2 * p, p)).divide(mF.factorial(j)));
    }
    return sum;
  }

  private Z compute(final int n, final int m) {
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int j = 0; j <= m; ++j) {
      final int h = n >>> j;
      sum = sum.add(get(n, (h - 1 + (h & 1)) << j, 1 << j));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return compute(mN, IntegerUtils.lg(mN));
  }
}
