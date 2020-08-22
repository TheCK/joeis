package irvine.oeis.a216;
// Generated by gen_seq4.pl modpow2 6 10000 at 2020-03-09 17:27
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A216128 6^n mod 10000.
 * @author Georg Fischer
 */
public class A216128 implements Sequence {

  private int mN = 1;
  private final Z mBase = Z.SIX;
  private final Z mMod = Z.valueOf(10000);

  @Override
  public Z next() {
    return mBase.modPow(Z.valueOf(mN++), mMod);
  }
}
