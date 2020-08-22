package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqden 748 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A042441 Denominators of continued fraction convergents to sqrt(748).
 * @author Georg Fischer
 */
public class A042441 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042441() {
    super(0, 748);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
