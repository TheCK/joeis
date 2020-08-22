package irvine.oeis.a266;
// Generated by gen_seq4.pl dexcr CR.ZERO.subtract(CR.SQRT2.multiply(REALS.atan(CR.SQRT2.divide(CR.FIVE)))).add(CR.PI.multiply(CR.SQRT2).divide(CR.FOUR)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A266814 Decimal expansion of -sqrt(2)*arctan(sqrt(2)/5) + Pi*sqrt(2)/4.
 * @author Georg Fischer
 */
public class A266814 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = CR.ZERO.subtract(CR.SQRT2.multiply(REALS.atan(CR.SQRT2.divide(CR.FIVE)))).add(CR.PI.multiply(CR.SQRT2).divide(CR.FOUR));

  @Override
  protected CR getCR() {
    return N;
  }
}
