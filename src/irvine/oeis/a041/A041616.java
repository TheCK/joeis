package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqnum 327 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.oeis.ContinuedFractionOfSqrtSequence;
import irvine.math.z.Z;

/**
 * A041616 Numerators of continued fraction convergents to sqrt(327).
 * @author Georg Fischer
 */
public class A041616 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041616() {
    super(0, 327);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
