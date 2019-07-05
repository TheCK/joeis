package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqden 597 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A042145 Denominators of continued fraction convergents to <code>sqrt(597)</code>.
 * @author Georg Fischer
 */
public class A042145 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042145() {
    super(0, 597);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}