package irvine.oeis.a244;
// Generated by gen_seq4.pl dex CR.PI.divide(CR.valueOf(12).multiply(CR.THREE.sqrt())) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A244977 Decimal expansion of Pi/(12*sqrt(3)).
 * @author Georg Fischer
 */
public class A244977 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A244977() {
    super(CR.PI.divide(CR.valueOf(12).multiply(CR.THREE.sqrt())));
  }
}
