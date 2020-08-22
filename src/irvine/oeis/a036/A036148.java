package irvine.oeis.a036;
// Generated by gen_seq4.pl modpow2 6 151 at 2020-03-09 17:27
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036148 6^n mod 151.
 * @author Georg Fischer
 */
public class A036148 implements Sequence {

  private int mN = 0;
  private final Z mBase = Z.SIX;
  private final Z mMod = Z.valueOf(151);

  @Override
  public Z next() {
    return mBase.modPow(Z.valueOf(mN++), mMod);
  }
}
