package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqnum 334 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.oeis.ContinuedFractionOfSqrtSequence;
import irvine.math.z.Z;

/**
 * A041630 Numerators of continued fraction convergents to <code>sqrt(334)</code>.
 * @author Georg Fischer
 */
public class A041630 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041630() {
    super(0, 334);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}