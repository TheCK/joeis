package irvine.oeis.a162;
// Generated by gen_seq4.pl dexcr CR.ONE.divide(REALS.pow(CR.valueOf(70).multiply(CR.PI.multiply(CR.valueOf(163).sqrt()).exp()), CR.TWO)) false 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A162916 Decimal expansion of 1/(70*exp(Pi*sqrt(163)))^2.
 * @author Georg Fischer
 */
public class A162916 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = CR.ONE.divide(REALS.pow(CR.valueOf(70).multiply(CR.PI.multiply(CR.valueOf(163).sqrt()).exp()), CR.TWO));

  /** Construct the sequence. */
  public A162916() {
    super(false, 10);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
