package irvine.oeis.a255;
// Generated by gen_seq4.pl dex CR.ZERO.subtract(CR.TWO.multiply(CR.FIVE.multiply(CR.PI).divide(CR.SEVEN).cos())) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A255249 Decimal expansion of -2*cos(5*Pi/7).
 * @author Georg Fischer
 */
public class A255249 extends DecimalExpansionSequence {

  private static final CR N = CR.ZERO.subtract(CR.TWO.multiply(CR.FIVE.multiply(CR.PI).divide(CR.SEVEN).cos()));

  @Override
  protected CR getCR() {
    return N;
  }
}
