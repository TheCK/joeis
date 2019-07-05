package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqnum 831 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.oeis.ContinuedFractionOfSqrtSequence;
import irvine.math.z.Z;

/**
 * A042604 Numerators of continued fraction convergents to <code>sqrt(831)</code>.
 * @author Georg Fischer
 */
public class A042604 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042604() {
    super(0, 831);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}