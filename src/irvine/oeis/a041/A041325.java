package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqden 176 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A041325 Denominators of continued fraction convergents to sqrt(176).
 * @author Georg Fischer
 */
public class A041325 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041325() {
    super(0, 176);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
