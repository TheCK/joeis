package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqnum 356 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.oeis.ContinuedFractionOfSqrtSequence;
import irvine.math.z.Z;

/**
 * A041674 Numerators of continued fraction convergents to <code>sqrt(356)</code>.
 * @author Georg Fischer
 */
public class A041674 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041674() {
    super(0, 356);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}