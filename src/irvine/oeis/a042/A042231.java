package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqden 641 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A042231 Denominators of continued fraction convergents to sqrt(641).
 * @author Georg Fischer
 */
public class A042231 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042231() {
    super(0, 641);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
