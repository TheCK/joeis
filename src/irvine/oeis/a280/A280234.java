package irvine.oeis.a280;
// Generated by gen_seq4.pl dex CR.valueOf(27).log().divide(CR.valueOf(27).divide(CR.FOUR).log()) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A280234 Decimal expansion of log(27)/log(27/4).
 * @author Georg Fischer
 */
public class A280234 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(27).log().divide(CR.valueOf(27).divide(CR.FOUR).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
