package irvine.oeis.a271;
// Generated by gen_seq4.pl modpow2 3 211 at 2020-03-09 17:27
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A271352 a(n) = 3^n mod 211.
 * @author Georg Fischer
 */
public class A271352 implements Sequence {

  private int mN = 0;
  private final Z mBase = Z.THREE;
  private final Z mMod = Z.valueOf(211);

  @Override
  public Z next() {
    return mBase.modPow(Z.valueOf(mN++), mMod);
  }
}
