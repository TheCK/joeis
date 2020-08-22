package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqnum 561 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.oeis.ContinuedFractionOfSqrtSequence;
import irvine.math.z.Z;

/**
 * A042074 Numerators of continued fraction convergents to sqrt(561).
 * @author Georg Fischer
 */
public class A042074 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042074() {
    super(0, 561);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
