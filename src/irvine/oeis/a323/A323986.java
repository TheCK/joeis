package irvine.oeis.a323;
// Generated by gen_seq4.pl dex CR.PI.divide(CR.THREE).exp() true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A323986 Decimal expansion of exp(Pi/3).
 * @author Georg Fischer
 */
public class A323986 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.divide(CR.THREE).exp();

  @Override
  protected CR getCR() {
    return N;
  }
}
