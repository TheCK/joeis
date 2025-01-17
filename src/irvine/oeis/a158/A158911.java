package irvine.oeis.a158;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a003.A003592;

/**
 * A158911 Numbers of the form 2^i*5^j - 1.
 * @author Georg Fischer
 */
public class A158911 implements Sequence {

  final Sequence mA003592 = new A003592();
  @Override
  public Z next() {
    return mA003592.next().subtract(Z.ONE);
  }

}
