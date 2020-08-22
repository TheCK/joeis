package irvine.oeis.a190;
// Generated by gen_seq4.pl dex CR.PI.multiply(CR.valueOf(163).sqrt()).divide(CR.THREE).exp() true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A190575 Decimal expansion of exp(Pi*sqrt(163)/3).
 * @author Georg Fischer
 */
public class A190575 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.multiply(CR.valueOf(163).sqrt()).divide(CR.THREE).exp();

  @Override
  protected CR getCR() {
    return N;
  }
}
