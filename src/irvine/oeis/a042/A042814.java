package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqnum 938 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.oeis.ContinuedFractionOfSqrtSequence;
import irvine.math.z.Z;

/**
 * A042814 Numerators of continued fraction convergents to sqrt(938).
 * @author Georg Fischer
 */
public class A042814 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042814() {
    super(0, 938);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
