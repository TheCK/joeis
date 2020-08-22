package irvine.oeis.a036;
// Generated by gen_seq4.pl modpow2 3 137 at 2020-03-09 17:27
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036145 3^n mod 137.
 * @author Georg Fischer
 */
public class A036145 implements Sequence {

  private int mN = 0;
  private final Z mBase = Z.THREE;
  private final Z mMod = Z.valueOf(137);

  @Override
  public Z next() {
    return mBase.modPow(Z.valueOf(mN++), mMod);
  }
}
