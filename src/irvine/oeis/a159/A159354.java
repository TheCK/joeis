package irvine.oeis.a159;
// Generated by gen_seq4.pl dex CR.valueOf(18).subtract(CR.valueOf(24).multiply(CR.TWO.log())) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A159354 Decimal expansion of 18 - 24*log(2).
 * @author Georg Fischer
 */
public class A159354 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(18).subtract(CR.valueOf(24).multiply(CR.TWO.log()));

  @Override
  protected CR getCR() {
    return N;
  }
}
