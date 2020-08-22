package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqden 792 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A042527 Denominators of continued fraction convergents to sqrt(792).
 * @author Georg Fischer
 */
public class A042527 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042527() {
    super(0, 792);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
