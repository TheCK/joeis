package irvine.oeis.a176;
// Generated by gen_seq4.pl dex CR.TEN.add(CR.valueOf(105).sqrt()).divide(CR.TWO) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A176535 Decimal expansion of (10 + sqrt(105))/2.
 * @author Georg Fischer
 */
public class A176535 extends DecimalExpansionSequence {

  private static final CR N = CR.TEN.add(CR.valueOf(105).sqrt()).divide(CR.TWO);

  @Override
  protected CR getCR() {
    return N;
  }
}
