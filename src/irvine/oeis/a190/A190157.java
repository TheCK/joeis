package irvine.oeis.a190;
// Generated by gen_seq4.pl dex CR.ONE.add(CR.ZERO.subtract(CR.ONE).add(CR.TWO.multiply(CR.FIVE.sqrt())).sqrt()).divide(CR.TWO) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A190157 Decimal expansion of (1+sqrt(-1+2*sqrt(5)))/2.
 * @author Georg Fischer
 */
public class A190157 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A190157() {
    super(CR.ONE.add(CR.ZERO.subtract(CR.ONE).add(CR.TWO.multiply(CR.FIVE.sqrt())).sqrt()).divide(CR.TWO));
  }
}
