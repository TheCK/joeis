package irvine.oeis.a070;
// Generated by gen_seq4.pl modpow 7 45 at 2020-01-19 20:24
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A070725 n^7 mod 45.
 * @author Georg Fischer
 */
public class A070725 implements Sequence {

  private int mN = 0;
  private final Z mExp = Z.SEVEN;
  private final Z mMod = Z.valueOf(45);

  @Override
  public Z next() {
    return Z.valueOf(mN++).modPow(mExp, mMod);
  }
}
