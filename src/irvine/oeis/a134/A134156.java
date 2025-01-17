package irvine.oeis.a134;
// Generated by gen_seq4.pl deriv at 2021-10-29 23:39

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000005;
import irvine.oeis.a049.A049820;
/**
 * A134156 a(n) = 2*tau(n) - n, where tau(n) is the number of divisors of n (A000005).
 * @author Georg Fischer
 */
public class A134156 implements Sequence {

  private final Sequence mA000005 = new A000005();
  private final Sequence mA049820 = new A049820();
  @Override
  public Z next() {
    return mA000005.next().subtract(mA049820.next());
  }

}
