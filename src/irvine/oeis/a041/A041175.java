package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqden 97 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A041175 Denominators of continued fraction convergents to sqrt(97).
 * @author Georg Fischer
 */
public class A041175 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041175() {
    super(0, 97);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
