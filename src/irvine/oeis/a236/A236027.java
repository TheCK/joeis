package irvine.oeis.a236;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.FIVE, CR.HALF).subtract(REALS.pow(CR.SEVEN, CR.ONE_THIRD)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A236027 Decimal expansion of 5^(1/2) - 7^(1/3).
 * @author Georg Fischer
 */
public class A236027 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.pow(CR.FIVE, CR.HALF).subtract(REALS.pow(CR.SEVEN, CR.ONE_THIRD));

  @Override
  protected CR getCR() {
    return N;
  }
}
