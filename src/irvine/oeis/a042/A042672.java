package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqnum 866 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.oeis.ContinuedFractionOfSqrtSequence;
import irvine.math.z.Z;

/**
 * A042672 Numerators of continued fraction convergents to sqrt(866).
 * @author Georg Fischer
 */
public class A042672 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042672() {
    super(0, 866);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
