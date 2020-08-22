package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqden 599 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A042149 Denominators of continued fraction convergents to sqrt(599).
 * @author Georg Fischer
 */
public class A042149 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042149() {
    super(0, 599);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
