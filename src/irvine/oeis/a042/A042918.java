package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqnum 991 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.oeis.ContinuedFractionOfSqrtSequence;
import irvine.math.z.Z;

/**
 * A042918 Numerators of continued fraction convergents to sqrt(991).
 * @author Georg Fischer
 */
public class A042918 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042918() {
    super(0, 991);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
