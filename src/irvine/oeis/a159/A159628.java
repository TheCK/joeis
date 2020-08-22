package irvine.oeis.a159;
// Generated by gen_seq4.pl dexcr CR.valueOf(855171).add(CR.valueOf(556990).multiply(CR.SQRT2)).divide(REALS.pow(CR.valueOf(577), CR.TWO)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A159628 Decimal expansion of (855171 + 556990*sqrt(2))/577^2.
 * @author Georg Fischer
 */
public class A159628 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = CR.valueOf(855171).add(CR.valueOf(556990).multiply(CR.SQRT2)).divide(REALS.pow(CR.valueOf(577), CR.TWO));

  @Override
  protected CR getCR() {
    return N;
  }
}
