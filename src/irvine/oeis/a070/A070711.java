package irvine.oeis.a070;
// Generated by gen_seq4.pl modpow 7 30 at 2020-01-19 20:24
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A070711 a(n) = n^7 mod 30.
 * @author Georg Fischer
 */
public class A070711 implements Sequence {

  private int mN = 0;
  private final Z mExp = Z.SEVEN;
  private final Z mMod = Z.valueOf(30);

  @Override
  public Z next() {
    return Z.valueOf(mN++).modPow(mExp, mMod);
  }
}
