package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqden 678 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A042303 Denominators of continued fraction convergents to sqrt(678).
 * @author Georg Fischer
 */
public class A042303 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042303() {
    super(0, 678);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
