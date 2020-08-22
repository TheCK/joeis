package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqnum 382 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.oeis.ContinuedFractionOfSqrtSequence;
import irvine.math.z.Z;

/**
 * A041724 Numerators of continued fraction convergents to sqrt(382).
 * @author Georg Fischer
 */
public class A041724 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041724() {
    super(0, 382);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
