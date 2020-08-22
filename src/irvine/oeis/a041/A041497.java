package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqden 265 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A041497 Denominators of continued fraction convergents to sqrt(265).
 * @author Georg Fischer
 */
public class A041497 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041497() {
    super(0, 265);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
