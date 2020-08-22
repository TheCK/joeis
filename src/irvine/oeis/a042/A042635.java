package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqden 847 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A042635 Denominators of continued fraction convergents to sqrt(847).
 * @author Georg Fischer
 */
public class A042635 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042635() {
    super(0, 847);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
