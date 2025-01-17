package irvine.oeis.a085;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a014.A014673;

/**
 * A085393 Difference between the largest and the smallest prime factor of the greatest proper divisor of n.
 * @author Georg Fischer
 */
public class A085393 implements Sequence {

  final Sequence mA014673 = new A014673();
  final Sequence mA085392 = new A085392();
  @Override
  public Z next() {
    return mA085392.next().subtract(mA014673.next());
  }

}
