package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqnum 409 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.oeis.ContinuedFractionOfSqrtSequence;
import irvine.math.z.Z;

/**
 * A041776 Numerators of continued fraction convergents to <code>sqrt(409)</code>.
 * @author Georg Fischer
 */
public class A041776 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041776() {
    super(0, 409);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}