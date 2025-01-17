package irvine.oeis.a118;
// Generated by gen_seq4.pl dex CR.NINE.multiply(CR.THREE.sqrt()).divide(CR.TWO).add(CR.FIVE.multiply(CR.PI)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A118308 Decimal expansion of (9*sqrt(3))/2 + 5*Pi.
 * @author Georg Fischer
 */
public class A118308 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A118308() {
    super(CR.NINE.multiply(CR.THREE.sqrt()).divide(CR.TWO).add(CR.FIVE.multiply(CR.PI)));
  }
}
