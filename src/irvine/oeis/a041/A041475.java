package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqden 253 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A041475 Denominators of continued fraction convergents to <code>sqrt(253)</code>.
 * @author Georg Fischer
 */
public class A041475 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041475() {
    super(0, 253);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}