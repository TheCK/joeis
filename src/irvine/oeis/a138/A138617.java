package irvine.oeis.a138;
// Generated by gen_seq4.pl modpow3 7 3 at 2020-03-09 17:27
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A138617 a(n) = 7^n mod 3^n.
 * @author Georg Fischer
 */
public class A138617 implements Sequence {

  private int mN = 0;
  private final Z mBase = Z.SEVEN;
  private final Z mMod = Z.THREE;

  @Override
  public Z next() {
    final Z modulus = mMod.pow(mN);
    return mBase.modPow(Z.valueOf(mN++), modulus);
  }
}
