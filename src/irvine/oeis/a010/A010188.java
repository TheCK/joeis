package irvine.oeis.a010;
// Generated by gen_seq4.pl cfsqrt 127 at 2019-07-04 10:53
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A010188 Continued fraction for sqrt(127).
 * @author Georg Fischer
 */
public class A010188 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A010188() {
    super(0, 127);
  }

  @Override
  public Z next() {
    final Z result = Z.valueOf(mB0);
    iterate();
    return result;
  }
}
