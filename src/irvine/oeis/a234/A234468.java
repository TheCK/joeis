package irvine.oeis.a234;
// Generated by gen_seq4.pl dex CR.valueOf(27).divide(CR.FOUR).log().divide(CR.EIGHT.log()) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A234468 Decimal expansion of log(27/4)/log(8).
 * @author Georg Fischer
 */
public class A234468 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(27).divide(CR.FOUR).log().divide(CR.EIGHT.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
