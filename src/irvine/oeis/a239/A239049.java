package irvine.oeis.a239;
// Generated by gen_seq4.pl dexcr CR.PI.multiply(REALS.pow(CR.TWO.divide(CR.THREE), CR.HALF)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A239049 Decimal expansion of Pi*(2/3)^(1/2).
 * @author Georg Fischer
 */
public class A239049 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = CR.PI.multiply(REALS.pow(CR.TWO.divide(CR.THREE), CR.HALF));

  @Override
  protected CR getCR() {
    return N;
  }
}
