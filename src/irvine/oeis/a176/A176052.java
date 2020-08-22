package irvine.oeis.a176;
// Generated by gen_seq4.pl dex CR.FIVE.add(CR.valueOf(35).sqrt()).divide(CR.FIVE) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A176052 Decimal expansion of (5+sqrt(35))/5.
 * @author Georg Fischer
 */
public class A176052 extends DecimalExpansionSequence {

  private static final CR N = CR.FIVE.add(CR.valueOf(35).sqrt()).divide(CR.FIVE);

  @Override
  protected CR getCR() {
    return N;
  }
}
