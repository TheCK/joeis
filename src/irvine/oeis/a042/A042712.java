package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqnum 886 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.oeis.ContinuedFractionOfSqrtSequence;
import irvine.math.z.Z;

/**
 * A042712 Numerators of continued fraction convergents to sqrt(886).
 * @author Georg Fischer
 */
public class A042712 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042712() {
    super(0, 886);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
