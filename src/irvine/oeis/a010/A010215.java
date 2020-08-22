package irvine.oeis.a010;
// Generated by gen_seq4.pl cfsqrt 167 at 2019-07-04 10:53
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A010215 Continued fraction for sqrt(167).
 * @author Georg Fischer
 */
public class A010215 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A010215() {
    super(0, 167);
  }

  @Override
  public Z next() {
    final Z result = Z.valueOf(mB0);
    iterate();
    return result;
  }
}
