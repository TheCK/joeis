package irvine.oeis.a077;
// Generated by gen_seq4.pl dex CR.ONE.add(CR.valueOf(11).sqrt().multiply(CR.valueOf(29).sqrt().add(CR.FIVE.sqrt())).divide(CR.valueOf(24))) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A077453 Decimal expansion of 1+sqrt(11)*(sqrt(29)+sqrt(5))/24.
 * @author Georg Fischer
 */
public class A077453 extends DecimalExpansionSequence {

  private static final CR N = CR.ONE.add(CR.valueOf(11).sqrt().multiply(CR.valueOf(29).sqrt().add(CR.FIVE.sqrt())).divide(CR.valueOf(24)));

  @Override
  protected CR getCR() {
    return N;
  }
}
