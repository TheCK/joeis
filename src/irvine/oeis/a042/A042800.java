package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqnum 931 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.oeis.ContinuedFractionOfSqrtSequence;
import irvine.math.z.Z;

/**
 * A042800 Numerators of continued fraction convergents to sqrt(931).
 * @author Georg Fischer
 */
public class A042800 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042800() {
    super(0, 931);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
