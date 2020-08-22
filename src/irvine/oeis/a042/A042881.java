package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqden 972 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A042881 Denominators of continued fraction convergents to sqrt(972).
 * @author Georg Fischer
 */
public class A042881 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042881() {
    super(0, 972);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
