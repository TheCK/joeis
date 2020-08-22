package irvine.oeis.a133;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.E.multiply(CR.PI).multiply(CR.PHI), CR.ONE_THIRD) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A133066 Decimal expansion of (e*Pi*Phi)^(1/3).
 * @author Georg Fischer
 */
public class A133066 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.pow(CR.E.multiply(CR.PI).multiply(CR.PHI), CR.ONE_THIRD);

  @Override
  protected CR getCR() {
    return N;
  }
}
