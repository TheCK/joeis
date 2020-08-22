package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqden 553 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A042059 Denominators of continued fraction convergents to sqrt(553).
 * @author Georg Fischer
 */
public class A042059 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042059() {
    super(0, 553);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
