package irvine.oeis.a158;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a023.A023228;

/**
 * A158014 Primes p such that (p-1)/8 is also prime.
 * @author Georg Fischer
 */
public class A158014 implements Sequence {

  final Sequence mA023228 = new A023228();
  @Override
  public Z next() {
    return Z.EIGHT.multiply(mA023228.next()).add(Z.ONE);
  }

}
