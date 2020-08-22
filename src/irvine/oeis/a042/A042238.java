package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqnum 645 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.oeis.ContinuedFractionOfSqrtSequence;
import irvine.math.z.Z;

/**
 * A042238 Numerators of continued fraction convergents to sqrt(645).
 * @author Georg Fischer
 */
public class A042238 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042238() {
    super(0, 645);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
