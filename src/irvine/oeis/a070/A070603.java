package irvine.oeis.a070;
// Generated by gen_seq4.pl modpow 5 19 at 2020-01-19 20:24
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A070603 n^5 mod 19.
 * @author Georg Fischer
 */
public class A070603 implements Sequence {

  private int mN = 0;
  private final Z mExp = Z.FIVE;
  private final Z mMod = Z.valueOf(19);

  @Override
  public Z next() {
    return Z.valueOf(mN++).modPow(mExp, mMod);
  }
}
