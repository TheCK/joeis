package irvine.oeis.a111;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a029.A029708;

/**
 * A111981 Numbers n such that 2n-1 and 2n+3 are consecutive primes.
 * @author Georg Fischer
 */
public class A111981 implements Sequence {

  final Sequence mA029708 = new A029708();
  @Override
  public Z next() {
    return mA029708.next().subtract(Z.ONE).divide(Z.TWO);
  }

}
