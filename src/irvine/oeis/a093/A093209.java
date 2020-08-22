package irvine.oeis.a093;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.PI, CR.ZERO.subtract(CR.ONE.divide(CR.EIGHT))) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A093209 Decimal expansion of Pi^(-1/8).
 * @author Georg Fischer
 */
public class A093209 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.pow(CR.PI, CR.ZERO.subtract(CR.ONE.divide(CR.EIGHT)));

  @Override
  protected CR getCR() {
    return N;
  }
}
