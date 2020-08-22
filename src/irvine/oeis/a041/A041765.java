package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqden 403 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A041765 Denominators of continued fraction convergents to sqrt(403).
 * @author Georg Fischer
 */
public class A041765 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041765() {
    super(0, 403);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
