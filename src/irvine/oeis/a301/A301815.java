package irvine.oeis.a301;
// Generated by gen_seq4.pl dexcr EulerGamma.SINGLETON.divide(CR.TAU) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.EulerGamma;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A301815 Decimal expansion of gamma / (2*Pi), where gamma is Euler's constant A001620.
 * @author Georg Fischer
 */
public class A301815 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = EulerGamma.SINGLETON.divide(CR.TAU);

  @Override
  protected CR getCR() {
    return N;
  }
}
