package irvine.oeis.a161;
// Generated by gen_seq4.pl dex CR.valueOf(209).add(CR.valueOf(60).multiply(CR.SQRT2)).divide(CR.valueOf(191)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A161488 Decimal expansion of (209+60*sqrt(2))/191.
 * @author Georg Fischer
 */
public class A161488 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(209).add(CR.valueOf(60).multiply(CR.SQRT2)).divide(CR.valueOf(191));

  @Override
  protected CR getCR() {
    return N;
  }
}
