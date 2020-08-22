package irvine.oeis.a323;
// Generated by gen_seq4.pl dex CR.PI.divide(CR.SIX).exp() true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A323984 Decimal expansion of exp(Pi/6).
 * @author Georg Fischer
 */
public class A323984 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.divide(CR.SIX).exp();

  @Override
  protected CR getCR() {
    return N;
  }
}
