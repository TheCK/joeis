package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqnum 38 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.oeis.ContinuedFractionOfSqrtSequence;
import irvine.math.z.Z;

/**
 * A041062 Numerators of continued fraction convergents to sqrt(38).
 * @author Georg Fischer
 */
public class A041062 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041062() {
    super(0, 38);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
