package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqden 612 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A042175 Denominators of continued fraction convergents to sqrt(612).
 * @author Georg Fischer
 */
public class A042175 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042175() {
    super(0, 612);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
