package irvine.oeis.a040;
// Generated by gen_seq4.pl cfsqrt 812 at 2019-07-04 10:53
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A040783 Continued fraction for sqrt(812).
 * @author Georg Fischer
 */
public class A040783 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A040783() {
    super(0, 812);
  }

  @Override
  public Z next() {
    final Z result = Z.valueOf(mB0);
    iterate();
    return result;
  }
}
