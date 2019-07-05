package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqden 652 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A042253 Denominators of continued fraction convergents to <code>sqrt(652)</code>.
 * @author Georg Fischer
 */
public class A042253 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042253() {
    super(0, 652);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}