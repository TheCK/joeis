package irvine.oeis.a040;
// Generated by gen_seq4.pl cfsqrt 877 at 2019-07-04 10:53
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A040847 Continued fraction for sqrt(877).
 * @author Georg Fischer
 */
public class A040847 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A040847() {
    super(0, 877);
  }

  @Override
  public Z next() {
    final Z result = Z.valueOf(mB0);
    iterate();
    return result;
  }
}
