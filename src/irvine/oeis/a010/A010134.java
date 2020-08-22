package irvine.oeis.a010;
// Generated by gen_seq4.pl cfsqrt 43 at 2019-07-04 10:53
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A010134 Continued fraction for sqrt(43).
 * @author Georg Fischer
 */
public class A010134 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A010134() {
    super(0, 43);
  }

  @Override
  public Z next() {
    final Z result = Z.valueOf(mB0);
    iterate();
    return result;
  }
}
