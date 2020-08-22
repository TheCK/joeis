package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqden 143 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A041263 Denominators of continued fraction convergents to sqrt(143).
 * @author Georg Fischer
 */
public class A041263 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041263() {
    super(0, 143);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
