package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqden 865 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A042671 Denominators of continued fraction convergents to <code>sqrt(865)</code>.
 * @author Georg Fischer
 */
public class A042671 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042671() {
    super(0, 865);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}