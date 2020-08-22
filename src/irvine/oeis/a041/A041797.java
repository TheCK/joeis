package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqden 419 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A041797 Denominators of continued fraction convergents to sqrt(419).
 * @author Georg Fischer
 */
public class A041797 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041797() {
    super(0, 419);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
