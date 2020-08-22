package irvine.oeis.a070;
// Generated by gen_seq4.pl modpow 4 48 at 2020-01-19 20:24
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A070591 n^4 mod 48.
 * @author Georg Fischer
 */
public class A070591 implements Sequence {

  private int mN = 0;
  private final Z mExp = Z.FOUR;
  private final Z mMod = Z.valueOf(48);

  @Override
  public Z next() {
    return Z.valueOf(mN++).modPow(mExp, mMod);
  }
}
