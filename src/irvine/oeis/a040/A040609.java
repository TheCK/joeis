package irvine.oeis.a040;
// Generated by gen_seq4.pl cfsqrt 635 at 2019-07-04 10:53
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A040609 Continued fraction for sqrt(635).
 * @author Georg Fischer
 */
public class A040609 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A040609() {
    super(0, 635);
  }

  @Override
  public Z next() {
    final Z result = Z.valueOf(mB0);
    iterate();
    return result;
  }
}
