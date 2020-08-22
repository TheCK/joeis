package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqnum 885 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.oeis.ContinuedFractionOfSqrtSequence;
import irvine.math.z.Z;

/**
 * A042710 Numerators of continued fraction convergents to sqrt(885).
 * @author Georg Fischer
 */
public class A042710 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042710() {
    super(0, 885);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
