package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqnum 906 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.oeis.ContinuedFractionOfSqrtSequence;
import irvine.math.z.Z;

/**
 * A042750 Numerators of continued fraction convergents to sqrt(906).
 * @author Georg Fischer
 */
public class A042750 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042750() {
    super(0, 906);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
