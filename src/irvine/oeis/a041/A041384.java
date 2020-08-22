package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqnum 207 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.oeis.ContinuedFractionOfSqrtSequence;
import irvine.math.z.Z;

/**
 * A041384 Numerators of continued fraction convergents to sqrt(207).
 * @author Georg Fischer
 */
public class A041384 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041384() {
    super(0, 207);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
