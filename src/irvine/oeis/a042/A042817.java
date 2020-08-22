package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqden 939 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A042817 Denominators of continued fraction convergents to sqrt(939).
 * @author Georg Fischer
 */
public class A042817 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042817() {
    super(0, 939);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
