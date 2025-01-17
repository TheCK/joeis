package irvine.oeis.a217;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000005;

/**
 * A217854 Product of all divisors of n, positive or negative.
 * @author Georg Fischer
 */
public class A217854 implements Sequence {

  final Sequence mA000005 = new A000005();
  protected long mN;
  /** Construct the sequence. */
  public A217854() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.ZERO.subtract(Z.valueOf(mN)).pow(mA000005.next());
  }

}
