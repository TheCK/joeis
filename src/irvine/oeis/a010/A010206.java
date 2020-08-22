package irvine.oeis.a010;
// Generated by gen_seq4.pl cfsqrt 157 at 2019-07-04 10:53
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A010206 Continued fraction for sqrt(157).
 * @author Georg Fischer
 */
public class A010206 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A010206() {
    super(0, 157);
  }

  @Override
  public Z next() {
    final Z result = Z.valueOf(mB0);
    iterate();
    return result;
  }
}
