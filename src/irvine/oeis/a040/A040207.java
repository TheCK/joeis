package irvine.oeis.a040;
// Generated by gen_seq4.pl cfsqrt 222 at 2019-07-04 10:53
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A040207 Continued fraction for sqrt(222).
 * @author Georg Fischer
 */
public class A040207 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A040207() {
    super(0, 222);
  }

  @Override
  public Z next() {
    final Z result = Z.valueOf(mB0);
    iterate();
    return result;
  }
}
