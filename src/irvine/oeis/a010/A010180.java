package irvine.oeis.a010;
// Generated by gen_seq4.pl cfsqrt 115 at 2019-07-04 10:53
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A010180 Continued fraction for sqrt(115).
 * @author Georg Fischer
 */
public class A010180 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A010180() {
    super(0, 115);
  }

  @Override
  public Z next() {
    final Z result = Z.valueOf(mB0);
    iterate();
    return result;
  }
}
