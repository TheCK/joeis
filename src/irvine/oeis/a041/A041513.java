package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqden 273 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A041513 Denominators of continued fraction convergents to sqrt(273).
 * @author Georg Fischer
 */
public class A041513 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041513() {
    super(0, 273);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
