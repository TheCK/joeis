package irvine.oeis.a040;
// Generated by gen_seq4.pl cfsqrt 230 at 2019-07-04 10:53
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A040214 Continued fraction for sqrt(230).
 * @author Georg Fischer
 */
public class A040214 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A040214() {
    super(0, 230);
  }

  @Override
  public Z next() {
    final Z result = Z.valueOf(mB0);
    iterate();
    return result;
  }
}
