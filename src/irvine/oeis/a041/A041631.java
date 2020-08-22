package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqden 334 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A041631 Denominators of continued fraction convergents to sqrt(334).
 * @author Georg Fischer
 */
public class A041631 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041631() {
    super(0, 334);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
