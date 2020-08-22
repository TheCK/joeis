package irvine.oeis.a090;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.E, CR.THREE).subtract(CR.TWO.multiply(REALS.pow(CR.E, CR.TWO))).add(CR.E.divide(CR.TWO)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A090143 Decimal expansion of e^3 - 2e^2 + e/2.
 * @author Georg Fischer
 */
public class A090143 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.pow(CR.E, CR.THREE).subtract(CR.TWO.multiply(REALS.pow(CR.E, CR.TWO))).add(CR.E.divide(CR.TWO));

  @Override
  protected CR getCR() {
    return N;
  }
}
