package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqnum 132 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.oeis.ContinuedFractionOfSqrtSequence;
import irvine.math.z.Z;

/**
 * A041240 Numerators of continued fraction convergents to sqrt(132).
 * @author Georg Fischer
 */
public class A041240 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041240() {
    super(0, 132);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
