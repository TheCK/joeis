package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034744 Dirichlet convolution of Fibonacci numbers with themselves.
 * @author Sean A. Irvine
 */
public class A034744 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Fibonacci.fibonacci(d).multiply(Fibonacci.fibonacci(mN / d)));
    }
    return sum;
  }
}
