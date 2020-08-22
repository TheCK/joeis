package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqden 535 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A042023 Denominators of continued fraction convergents to sqrt(535).
 * @author Georg Fischer
 */
public class A042023 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042023() {
    super(0, 535);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
