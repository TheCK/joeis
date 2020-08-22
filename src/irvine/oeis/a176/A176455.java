package irvine.oeis.a176;
// Generated by gen_seq4.pl dex CR.valueOf(20).add(CR.TWO.multiply(CR.valueOf(110).sqrt())).divide(CR.FIVE) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A176455 Decimal expansion of (20+2*sqrt(110))/5.
 * @author Georg Fischer
 */
public class A176455 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(20).add(CR.TWO.multiply(CR.valueOf(110).sqrt())).divide(CR.FIVE);

  @Override
  protected CR getCR() {
    return N;
  }
}
