package irvine.oeis.a171;
// Generated by gen_seq4.pl dex CR.TWO.divide(CR.valueOf(35).sqrt()) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A171543 Decimal expansion of 2/sqrt(35).
 * @author Georg Fischer
 */
public class A171543 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.divide(CR.valueOf(35).sqrt());

  @Override
  protected CR getCR() {
    return N;
  }
}
