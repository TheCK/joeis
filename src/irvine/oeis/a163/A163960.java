package irvine.oeis.a163;
// Generated by gen_seq4.pl dex CR.TWO.multiply(CR.SQRT2.subtract(CR.ONE)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A163960 Decimal expansion of 2*(sqrt(2) - 1).
 * @author Georg Fischer
 */
public class A163960 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.multiply(CR.SQRT2.subtract(CR.ONE));

  @Override
  protected CR getCR() {
    return N;
  }
}
