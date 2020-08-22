package irvine.oeis.a061;
// Generated by gen_seq4.pl nthprime 2020-06-14 20:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A061591 a(n) = 2^x, where x = p*(p-1)/2 and p is the n-th prime.
 * @author Georg Fischer
 */
public class A061591 extends A000040 {
  protected long mN = 0;
  @Override
  public Z next() {
    ++mN;
    final Z nextPrime = super.next();
    return Z.TWO.pow(nextPrime.multiply(nextPrime.subtract(Z.ONE)).divide(Z.TWO));
  }
}
