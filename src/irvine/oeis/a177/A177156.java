package irvine.oeis.a177;
// Generated by gen_seq4.pl dex CR.NINE.add(CR.valueOf(221).sqrt()).divide(CR.valueOf(14)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A177156 Decimal expansion of (9+sqrt(221))/14.
 * @author Georg Fischer
 */
public class A177156 extends DecimalExpansionSequence {

  private static final CR N = CR.NINE.add(CR.valueOf(221).sqrt()).divide(CR.valueOf(14));

  @Override
  protected CR getCR() {
    return N;
  }
}
