package irvine.oeis.a323;
// Generated by gen_seq4.pl dex CR.PI.divide(CR.SEVEN).sin() true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A323601 Decimal expansion of sin(Pi/7).
 * @author Georg Fischer
 */
public class A323601 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.divide(CR.SEVEN).sin();

  @Override
  protected CR getCR() {
    return N;
  }
}
