package irvine.oeis.a138;
// Generated by gen_seq4.pl nthprime 2020-06-14 20:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A138402 a(n) = (n-th prime)^4-(n-th prime)^2.
 * @author Georg Fischer
 */
public class A138402 extends A000040 {
  protected long mN = 0;
  @Override
  public Z next() {
    ++mN;
    final Z nextPrime = super.next();
    return nextPrime.pow(4).subtract(nextPrime.pow(2));
  }
}
