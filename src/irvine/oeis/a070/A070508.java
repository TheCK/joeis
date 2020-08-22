package irvine.oeis.a070;
// Generated by gen_seq4.pl modpow 3 46 at 2020-01-19 20:24
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A070508 a(n) = n^3 mod 46.
 * @author Georg Fischer
 */
public class A070508 implements Sequence {

  private int mN = 0;
  private final Z mExp = Z.THREE;
  private final Z mMod = Z.valueOf(46);

  @Override
  public Z next() {
    return Z.valueOf(mN++).modPow(mExp, mMod);
  }
}
