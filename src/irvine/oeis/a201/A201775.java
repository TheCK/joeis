package irvine.oeis.a201;
// Generated by gen_seq4.pl dex CR.ONE.divide(CR.PI.subtract(CR.ONE)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A201775 Decimal expansion of 1/(Pi - 1).
 * @author Georg Fischer
 */
public class A201775 extends DecimalExpansionSequence {

  private static final CR N = CR.ONE.divide(CR.PI.subtract(CR.ONE));

  @Override
  protected CR getCR() {
    return N;
  }
}
