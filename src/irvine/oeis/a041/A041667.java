package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqden 352 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A041667 Denominators of continued fraction convergents to sqrt(352).
 * @author Georg Fischer
 */
public class A041667 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041667() {
    super(0, 352);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
