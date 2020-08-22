package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqnum 861 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.oeis.ContinuedFractionOfSqrtSequence;
import irvine.math.z.Z;

/**
 * A042662 Numerators of continued fraction convergents to sqrt(861).
 * @author Georg Fischer
 */
public class A042662 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042662() {
    super(0, 861);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
