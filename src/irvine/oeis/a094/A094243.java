package irvine.oeis.a094;
// Generated by gen_seq4.pl dexcr CR.ONE.divide(REALS.pow(CR.PI.add(CR.E), CR.THREE)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A094243 Decimal expansion of 1/(Pi + e)^3.
 * @author Georg Fischer
 */
public class A094243 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = CR.ONE.divide(REALS.pow(CR.PI.add(CR.E), CR.THREE));

  @Override
  protected CR getCR() {
    return N;
  }
}
