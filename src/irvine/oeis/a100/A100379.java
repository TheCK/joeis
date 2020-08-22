package irvine.oeis.a100;
// Generated by gen_seq4.pl dex CR.PI.multiply(CR.valueOf(29).divide(CR.TWO).sqrt()).exp() true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A100379 Decimal expansion of exp(Pi*sqrt(29/2)).
 * @author Georg Fischer
 */
public class A100379 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.multiply(CR.valueOf(29).divide(CR.TWO).sqrt()).exp();

  @Override
  protected CR getCR() {
    return N;
  }
}
