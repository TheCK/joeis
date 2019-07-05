package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqnum 236 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.oeis.ContinuedFractionOfSqrtSequence;
import irvine.math.z.Z;

/**
 * A041440 Numerators of continued fraction convergents to <code>sqrt(236)</code>.
 * @author Georg Fischer
 */
public class A041440 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041440() {
    super(0, 236);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}