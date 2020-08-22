package irvine.oeis.a171;
// Generated by gen_seq4.pl dex CR.TWO.multiply(CR.TWO.divide(CR.valueOf(15)).sqrt()) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A171535 Decimal expansion of 2*sqrt(2/15).
 * @author Georg Fischer
 */
public class A171535 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.multiply(CR.TWO.divide(CR.valueOf(15)).sqrt());

  @Override
  protected CR getCR() {
    return N;
  }
}
