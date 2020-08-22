package irvine.oeis.a070;
// Generated by gen_seq4.pl modpow 4 21 at 2020-01-19 20:24
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A070540 a(n) = n^4 mod 21.
 * @author Georg Fischer
 */
public class A070540 implements Sequence {

  private int mN = 0;
  private final Z mExp = Z.FOUR;
  private final Z mMod = Z.valueOf(21);

  @Override
  public Z next() {
    return Z.valueOf(mN++).modPow(mExp, mMod);
  }
}
