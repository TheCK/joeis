package irvine.oeis.a118;
// Generated by gen_seq4.pl dex CR.HALF.multiply(CR.ZERO.subtract(CR.NINE.multiply(CR.THREE.sqrt())).add(CR.FIVE.multiply(CR.PI))) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A118309 Decimal expansion of (1/2)*(-9*sqrt(3) + 5*Pi).
 * @author Georg Fischer
 */
public class A118309 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A118309() {
    super(CR.HALF.multiply(CR.ZERO.subtract(CR.NINE.multiply(CR.THREE.sqrt())).add(CR.FIVE.multiply(CR.PI))));
  }
}
