package irvine.oeis.a032;
// Generated by gen_seq4.pl nthprime 2020-06-14 20:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000959;

/**
 * A032600 Difference between n-th lucky number and n-th prime number.
 * @author Georg Fischer
 */
public class A032600 extends A000040 {
  protected long mN = 0;
final Sequence mLuckies = new A000959();

  @Override
  public Z next() {
    ++mN;
    final Z nextPrime = super.next();
    return mLuckies.next().subtract(nextPrime);
  }
}
