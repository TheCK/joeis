package irvine.oeis.a040;
// Generated by gen_seq4.pl cfsqrt 242 at 2019-07-04 10:53
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A040226 Continued fraction for sqrt(242).
 * @author Georg Fischer
 */
public class A040226 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A040226() {
    super(0, 242);
  }

  @Override
  public Z next() {
    final Z result = Z.valueOf(mB0);
    iterate();
    return result;
  }
}
