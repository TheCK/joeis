package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqnum 157 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.oeis.ContinuedFractionOfSqrtSequence;
import irvine.math.z.Z;

/**
 * A041288 Numerators of continued fraction convergents to sqrt(157).
 * @author Georg Fischer
 */
public class A041288 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041288() {
    super(0, 157);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
