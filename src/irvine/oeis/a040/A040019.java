package irvine.oeis.a040;
// Generated by gen_seq4.pl cfsqrt 24 at 2019-07-04 10:53
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A040019 Continued fraction for sqrt(24).
 * @author Georg Fischer
 */
public class A040019 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A040019() {
    super(0, 24);
  }

  @Override
  public Z next() {
    final Z result = Z.valueOf(mB0);
    iterate();
    return result;
  }
}
