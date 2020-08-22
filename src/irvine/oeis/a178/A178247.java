package irvine.oeis.a178;
// Generated by gen_seq4.pl dex CR.valueOf(269).add(CR.valueOf(11).multiply(CR.valueOf(1086).sqrt())).divide(CR.valueOf(490)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A178247 Decimal expansion of (269+11*sqrt(1086))/490.
 * @author Georg Fischer
 */
public class A178247 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(269).add(CR.valueOf(11).multiply(CR.valueOf(1086).sqrt())).divide(CR.valueOf(490));

  @Override
  protected CR getCR() {
    return N;
  }
}
