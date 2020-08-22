package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqnum 40 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.oeis.ContinuedFractionOfSqrtSequence;
import irvine.math.z.Z;

/**
 * A041066 Numerators of continued fraction convergents to sqrt(40).
 * @author Georg Fischer
 */
public class A041066 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041066() {
    super(0, 40);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
