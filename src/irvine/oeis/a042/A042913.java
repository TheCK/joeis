package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqden 988 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A042913 Denominators of continued fraction convergents to sqrt(988).
 * @author Georg Fischer
 */
public class A042913 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042913() {
    super(0, 988);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
