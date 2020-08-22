package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqden 139 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A041255 Denominators of continued fraction convergents to sqrt(139).
 * @author Georg Fischer
 */
public class A041255 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041255() {
    super(0, 139);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
