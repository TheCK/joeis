package irvine.oeis.a108;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a103.A103002;

/**
 * A108837 Primes of the form 5*10^n-7.
 * @author Georg Fischer
 */
public class A108837 implements Sequence {

  final Sequence mA103002 = new A103002();
  @Override
  public Z next() {
    return Z.FIVE.multiply(Z.TEN.pow(mA103002.next())).subtract(Z.SEVEN);
  }

}
