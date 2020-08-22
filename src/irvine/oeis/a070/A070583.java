package irvine.oeis.a070;
// Generated by gen_seq4.pl modpow 4 40 at 2020-01-19 20:24
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A070583 n^4 mod 40.
 * @author Georg Fischer
 */
public class A070583 implements Sequence {

  private int mN = 0;
  private final Z mExp = Z.FOUR;
  private final Z mMod = Z.valueOf(40);

  @Override
  public Z next() {
    return Z.valueOf(mN++).modPow(mExp, mMod);
  }
}
