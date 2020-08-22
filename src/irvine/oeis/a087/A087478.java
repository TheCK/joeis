package irvine.oeis.a087;
// Generated by gen_seq4.pl dex CR.valueOf(20467).sqrt().subtract(CR.valueOf(19578).sqrt()).add(CR.valueOf(10177).sqrt()).subtract(CR.valueOf(9553).sqrt()).divide(CR.TWO) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A087478 Decimal expansion of (sqrt(20467) - sqrt(19578) + sqrt(10177) - sqrt(9553))/2.
 * @author Georg Fischer
 */
public class A087478 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(20467).sqrt().subtract(CR.valueOf(19578).sqrt()).add(CR.valueOf(10177).sqrt()).subtract(CR.valueOf(9553).sqrt()).divide(CR.TWO);

  @Override
  protected CR getCR() {
    return N;
  }
}
