package irvine.oeis.a035;
// Generated by gen_seq4.pl nthprime 2020-06-14 20:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A035103 Number of 0's in binary representation of n-th prime.
 * @author Georg Fischer
 */
public class A035103 extends A000040 {
  protected long mN = 0;
  @Override
  public Z next() {
    ++mN;
    final Z nextPrime = super.next();
    return Z.valueOf(nextPrime.bitLength() - nextPrime.bitCount());
  }
}
