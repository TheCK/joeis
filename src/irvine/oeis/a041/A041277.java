package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqden 151 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionOfSqrtSequence;

/**
 * A041277 Denominators of continued fraction convergents to sqrt(151).
 * @author Georg Fischer
 */
public class A041277 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041277() {
    super(0, 151);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
