package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqden 544 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A042041 Denominators of continued fraction convergents to sqrt(544).
 * @author Georg Fischer
 */
public class A042041 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042041() {
    super(0, 544);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
