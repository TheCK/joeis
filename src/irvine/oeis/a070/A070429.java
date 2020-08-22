package irvine.oeis.a070;
// Generated by gen_seq4.pl modpow2 7 47 at 2020-03-09 17:27
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A070429 a(n) = 7^n mod 47.
 * @author Georg Fischer
 */
public class A070429 implements Sequence {

  private int mN = 0;
  private final Z mBase = Z.SEVEN;
  private final Z mMod = Z.valueOf(47);

  @Override
  public Z next() {
    return mBase.modPow(Z.valueOf(mN++), mMod);
  }
}
