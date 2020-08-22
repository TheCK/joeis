package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqnum 249 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.oeis.ContinuedFractionOfSqrtSequence;
import irvine.math.z.Z;

/**
 * A041466 Numerators of continued fraction convergents to sqrt(249).
 * @author Georg Fischer
 */
public class A041466 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041466() {
    super(0, 249);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
