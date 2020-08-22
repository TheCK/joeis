package irvine.oeis.a180;
// Generated by gen_seq4.pl dex CR.TWO.subtract(CR.PI.divide(CR.TWO)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A180434 Decimal expansion of constant (2 - Pi/2).
 * @author Georg Fischer
 */
public class A180434 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.subtract(CR.PI.divide(CR.TWO));

  @Override
  protected CR getCR() {
    return N;
  }
}
