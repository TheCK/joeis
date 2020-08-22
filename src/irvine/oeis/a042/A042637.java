package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqden 848 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A042637 Denominators of continued fraction convergents to sqrt(848).
 * @author Georg Fischer
 */
public class A042637 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042637() {
    super(0, 848);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
