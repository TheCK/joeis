package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqnum 834 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.oeis.ContinuedFractionOfSqrtSequence;
import irvine.math.z.Z;

/**
 * A042610 Numerators of continued fraction convergents to sqrt(834).
 * @author Georg Fischer
 */
public class A042610 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042610() {
    super(0, 834);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
