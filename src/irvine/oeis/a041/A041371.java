package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqden 200 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A041371 Denominators of continued fraction convergents to sqrt(200).
 * @author Georg Fischer
 */
public class A041371 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041371() {
    super(0, 200);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
