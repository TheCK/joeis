package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqnum 353 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.oeis.ContinuedFractionOfSqrtSequence;
import irvine.math.z.Z;

/**
 * A041668 Numerators of continued fraction convergents to <code>sqrt(353)</code>.
 * @author Georg Fischer
 */
public class A041668 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041668() {
    super(0, 353);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}