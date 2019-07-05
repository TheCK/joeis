package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqden 835 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A042613 Denominators of continued fraction convergents to <code>sqrt(835)</code>.
 * @author Georg Fischer
 */
public class A042613 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042613() {
    super(0, 835);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}