package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqnum 797 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.oeis.ContinuedFractionOfSqrtSequence;
import irvine.math.z.Z;

/**
 * A042536 Numerators of continued fraction convergents to sqrt(797).
 * @author Georg Fischer
 */
public class A042536 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042536() {
    super(0, 797);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
