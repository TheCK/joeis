package irvine.oeis.a070;
// Generated by gen_seq4.pl nthprime 2020-06-14 20:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A070750 0 if n-th prime is even, 1 if n-th prime is == 1 mod 4, and -1 if n-th prime is == 3 mod 4.
 * @author Georg Fischer
 */
public class A070750 extends A000040 {
  protected long mN = 0;
  @Override
  public Z next() {
    ++mN;
    final Z nextPrime = super.next();
    return mN == 1 ? Z.ZERO : (nextPrime.mod(Z.FOUR).equals(Z.ONE) ? Z.ONE : Z.NEG_ONE);
  }
}
