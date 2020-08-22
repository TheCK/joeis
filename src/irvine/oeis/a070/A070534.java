package irvine.oeis.a070;
// Generated by gen_seq4.pl modpow 4 17 at 2020-01-19 20:24
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A070534 a(n) = n^4 mod 17.
 * @author Georg Fischer
 */
public class A070534 implements Sequence {

  private int mN = 0;
  private final Z mExp = Z.FOUR;
  private final Z mMod = Z.valueOf(17);

  @Override
  public Z next() {
    return Z.valueOf(mN++).modPow(mExp, mMod);
  }
}
