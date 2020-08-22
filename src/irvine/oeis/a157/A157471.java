package irvine.oeis.a157;
// Generated by gen_seq4.pl dexcr CR.valueOf(19491).add(CR.valueOf(12070).multiply(CR.SQRT2)).divide(REALS.pow(CR.valueOf(97), CR.TWO)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A157471 Decimal expansion of (19491+12070*sqrt(2))/97^2.
 * @author Georg Fischer
 */
public class A157471 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = CR.valueOf(19491).add(CR.valueOf(12070).multiply(CR.SQRT2)).divide(REALS.pow(CR.valueOf(97), CR.TWO));

  @Override
  protected CR getCR() {
    return N;
  }
}
