package irvine.oeis.a220;
// Generated by gen_seq4.pl dex CR.ONE.divide(CR.E).multiply(CR.E.log().divide(CR.TEN.log())) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A220261 Decimal expansion of (1/e) * log_10(e), where 1/e = A068985, log_10(e) = A002285.
 * @author Georg Fischer
 */
public class A220261 extends DecimalExpansionSequence {

  private static final CR N = CR.ONE.divide(CR.E).multiply(CR.E.log().divide(CR.TEN.log()));

  @Override
  protected CR getCR() {
    return N;
  }
}
