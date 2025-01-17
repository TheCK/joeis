package irvine.oeis.a156;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a005.A005384;
import irvine.oeis.a005.A005385;

/**
 * A156592 Product p*q of two primes with q = 2*p + 1.
 * @author Georg Fischer
 */
public class A156592 implements Sequence {

  final Sequence mA005384 = new A005384();
  final Sequence mA005385 = new A005385();
  @Override
  public Z next() {
    return mA005384.next().multiply(mA005385.next());
  }

}
