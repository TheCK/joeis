package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqnum 949 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.oeis.ContinuedFractionOfSqrtSequence;
import irvine.math.z.Z;

/**
 * A042836 Numerators of continued fraction convergents to <code>sqrt(949)</code>.
 * @author Georg Fischer
 */
public class A042836 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042836() {
    super(0, 949);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}