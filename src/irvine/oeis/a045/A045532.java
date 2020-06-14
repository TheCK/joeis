package irvine.oeis.a045;
// Generated by gen_seq4.pl nthprime 2020-06-14 20:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A045532 Concatenate n with n-th prime.
 * @author Georg Fischer
 */
public class A045532 extends A000040 {
  protected long mN = 0;
  @Override
  public Z next() {
    ++mN;
    final Z nextPrime = super.next();
    return new Z(String.valueOf(mN) + nextPrime.toString());
  }
}
