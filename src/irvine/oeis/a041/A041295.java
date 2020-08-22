package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqden 160 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A041295 Denominators of continued fraction convergents to sqrt(160).
 * @author Georg Fischer
 */
public class A041295 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041295() {
    super(0, 160);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
