package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqnum 808 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.oeis.ContinuedFractionOfSqrtSequence;
import irvine.math.z.Z;

/**
 * A042558 Numerators of continued fraction convergents to sqrt(808).
 * @author Georg Fischer
 */
public class A042558 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042558() {
    super(0, 808);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
