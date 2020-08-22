package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqden 699 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A042345 Denominators of continued fraction convergents to sqrt(699).
 * @author Georg Fischer
 */
public class A042345 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042345() {
    super(0, 699);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
