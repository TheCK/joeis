package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqden 359 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A041681 Denominators of continued fraction convergents to sqrt(359).
 * @author Georg Fischer
 */
public class A041681 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041681() {
    super(0, 359);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
