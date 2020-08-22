package irvine.oeis.a176;
// Generated by gen_seq4.pl dex CR.TEN.add(CR.valueOf(110).sqrt()).divide(CR.FIVE) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A176220 Decimal expansion of (10+sqrt(110))/5.
 * @author Georg Fischer
 */
public class A176220 extends DecimalExpansionSequence {

  private static final CR N = CR.TEN.add(CR.valueOf(110).sqrt()).divide(CR.FIVE);

  @Override
  protected CR getCR() {
    return N;
  }
}
