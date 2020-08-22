package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqden 897 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A042735 Denominators of continued fraction convergents to sqrt(897).
 * @author Georg Fischer
 */
public class A042735 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042735() {
    super(0, 897);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
