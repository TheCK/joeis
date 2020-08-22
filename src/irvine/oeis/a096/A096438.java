package irvine.oeis.a096;
// Generated by gen_seq4.pl dexcr REALS.pow(REALS.pow(CR.PI, CR.TWO).subtract(REALS.pow(CR.E, CR.TWO)), CR.ONE_THIRD) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A096438 Decimal expansion of (Pi^2 - e^2)^(1/3).
 * @author Georg Fischer
 */
public class A096438 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.pow(REALS.pow(CR.PI, CR.TWO).subtract(REALS.pow(CR.E, CR.TWO)), CR.ONE_THIRD);

  @Override
  protected CR getCR() {
    return N;
  }
}
