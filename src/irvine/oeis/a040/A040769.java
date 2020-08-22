package irvine.oeis.a040;
// Generated by gen_seq4.pl cfsqrt 798 at 2019-07-04 10:53
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A040769 Continued fraction for sqrt(798).
 * @author Georg Fischer
 */
public class A040769 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A040769() {
    super(0, 798);
  }

  @Override
  public Z next() {
    final Z result = Z.valueOf(mB0);
    iterate();
    return result;
  }
}
