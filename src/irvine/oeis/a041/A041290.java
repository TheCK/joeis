package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqnum 158 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.oeis.ContinuedFractionOfSqrtSequence;
import irvine.math.z.Z;

/**
 * A041290 Numerators of continued fraction convergents to sqrt(158).
 * @author Georg Fischer
 */
public class A041290 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041290() {
    super(0, 158);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
