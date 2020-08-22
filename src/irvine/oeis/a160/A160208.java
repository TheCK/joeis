package irvine.oeis.a160;
// Generated by gen_seq4.pl dexcr CR.valueOf(1208787).add(CR.valueOf(678878).multiply(CR.SQRT2)).divide(REALS.pow(CR.valueOf(857), CR.TWO)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A160208 Decimal expansion of (1208787 +678878*sqrt(2))/857^2.
 * @author Georg Fischer
 */
public class A160208 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = CR.valueOf(1208787).add(CR.valueOf(678878).multiply(CR.SQRT2)).divide(REALS.pow(CR.valueOf(857), CR.TWO));

  @Override
  protected CR getCR() {
    return N;
  }
}
