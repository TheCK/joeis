package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqden 201 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A041373 Denominators of continued fraction convergents to sqrt(201).
 * @author Georg Fischer
 */
public class A041373 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041373() {
    super(0, 201);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
