package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqden 755 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A042455 Denominators of continued fraction convergents to sqrt(755).
 * @author Georg Fischer
 */
public class A042455 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042455() {
    super(0, 755);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
