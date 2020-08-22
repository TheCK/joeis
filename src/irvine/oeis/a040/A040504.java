package irvine.oeis.a040;
// Generated by gen_seq4.pl cfsqrt 527 at 2019-07-04 10:53
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A040504 Continued fraction for sqrt(527).
 * @author Georg Fischer
 */
public class A040504 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A040504() {
    super(0, 527);
  }

  @Override
  public Z next() {
    final Z result = Z.valueOf(mB0);
    iterate();
    return result;
  }
}
