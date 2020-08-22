package irvine.oeis.a179;
// Generated by gen_seq4.pl dex CR.valueOf(51).sqrt().divide(CR.SEVEN) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A179461 Decimal expansion of sqrt(51)/7.
 * @author Georg Fischer
 */
public class A179461 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(51).sqrt().divide(CR.SEVEN);

  @Override
  protected CR getCR() {
    return N;
  }
}
