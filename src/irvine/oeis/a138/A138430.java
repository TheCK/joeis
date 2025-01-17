package irvine.oeis.a138;
// Generated by gen_seq4.pl nthprime 2020-06-14 20:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A138430 (prime(n)^5 - prime(n))/30.
 * @author Georg Fischer
 */
public class A138430 extends A000040 {
  protected long mN = 0;
  @Override
  public Z next() {
    ++mN;
    final Z nextPrime = super.next();
    return nextPrime.pow(5).subtract(nextPrime).divide(Z.valueOf(30));
  }
}
