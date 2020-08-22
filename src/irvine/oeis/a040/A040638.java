package irvine.oeis.a040;
// Generated by gen_seq4.pl cfsqrt 664 at 2019-07-04 10:53
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A040638 Continued fraction for sqrt(664).
 * @author Georg Fischer
 */
public class A040638 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A040638() {
    super(0, 664);
  }

  @Override
  public Z next() {
    final Z result = Z.valueOf(mB0);
    iterate();
    return result;
  }
}
