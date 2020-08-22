package irvine.oeis.a040;
// Generated by gen_seq4.pl cfsqrt 891 at 2019-07-04 10:53
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A040861 Continued fraction for sqrt(891).
 * @author Georg Fischer
 */
public class A040861 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A040861() {
    super(0, 891);
  }

  @Override
  public Z next() {
    final Z result = Z.valueOf(mB0);
    iterate();
    return result;
  }
}
