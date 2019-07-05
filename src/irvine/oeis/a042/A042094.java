package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqnum 571 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.oeis.ContinuedFractionOfSqrtSequence;
import irvine.math.z.Z;

/**
 * A042094 Numerators of continued fraction convergents to <code>sqrt(571)</code>.
 * @author Georg Fischer
 */
public class A042094 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042094() {
    super(0, 571);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}