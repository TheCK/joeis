package irvine.oeis.a070;
// Generated by gen_seq4.pl modpow 7 29 at 2020-01-19 20:24
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A070710 n^7 mod 29.
 * @author Georg Fischer
 */
public class A070710 implements Sequence {

  private int mN = 0;
  private final Z mExp = Z.SEVEN;
  private final Z mMod = Z.valueOf(29);

  @Override
  public Z next() {
    return Z.valueOf(mN++).modPow(mExp, mMod);
  }
}
