package irvine.oeis.a177;
// Generated by gen_seq4.pl dex CR.SEVEN.add(CR.valueOf(93).sqrt()).divide(CR.SIX) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A177003 Decimal expansion of (7+sqrt(93))/6.
 * @author Georg Fischer
 */
public class A177003 extends DecimalExpansionSequence {

  private static final CR N = CR.SEVEN.add(CR.valueOf(93).sqrt()).divide(CR.SIX);

  @Override
  protected CR getCR() {
    return N;
  }
}
