package irvine.oeis.a171;
// Generated by gen_seq4.pl dex CR.TWO.multiply(CR.TWO.divide(CR.valueOf(35)).sqrt()) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A171548 Decimal expansion of 2*sqrt(2/35).
 * @author Georg Fischer
 */
public class A171548 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.multiply(CR.TWO.divide(CR.valueOf(35)).sqrt());

  @Override
  protected CR getCR() {
    return N;
  }
}
