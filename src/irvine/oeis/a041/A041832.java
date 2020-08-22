package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqnum 437 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.oeis.ContinuedFractionOfSqrtSequence;
import irvine.math.z.Z;

/**
 * A041832 Numerators of continued fraction convergents to sqrt(437).
 * @author Georg Fischer
 */
public class A041832 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041832() {
    super(0, 437);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
