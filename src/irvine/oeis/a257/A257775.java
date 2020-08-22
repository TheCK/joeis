package irvine.oeis.a257;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.E.divide(CR.TWO), CR.TWO) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A257775 Decimal expansion of (e/2)^2.
 * @author Georg Fischer
 */
public class A257775 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.pow(CR.E.divide(CR.TWO), CR.TWO);

  @Override
  protected CR getCR() {
    return N;
  }
}
