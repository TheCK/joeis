package irvine.oeis.a040;
// Generated by gen_seq4.pl cfsqrt 68 at 2019-07-04 10:53
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A040059 Continued fraction for sqrt(68).
 * @author Georg Fischer
 */
public class A040059 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A040059() {
    super(0, 68);
  }

  @Override
  public Z next() {
    final Z result = Z.valueOf(mB0);
    iterate();
    return result;
  }
}
