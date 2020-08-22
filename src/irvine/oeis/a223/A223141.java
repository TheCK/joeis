package irvine.oeis.a223;
// Generated by gen_seq4.pl dex CR.valueOf(29).sqrt().subtract(CR.ONE).divide(CR.TWO) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A223141 Decimal expansion of (sqrt(29) - 1)/2.
 * @author Georg Fischer
 */
public class A223141 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(29).sqrt().subtract(CR.ONE).divide(CR.TWO);

  @Override
  protected CR getCR() {
    return N;
  }
}
