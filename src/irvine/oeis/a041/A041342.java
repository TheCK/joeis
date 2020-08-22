package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqnum 185 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.oeis.ContinuedFractionOfSqrtSequence;
import irvine.math.z.Z;

/**
 * A041342 Numerators of continued fraction convergents to sqrt(185).
 * @author Georg Fischer
 */
public class A041342 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041342() {
    super(0, 185);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
