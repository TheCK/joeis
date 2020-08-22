package irvine.oeis.a092;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.PI.multiply(CR.E), CR.THREE) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A092138 Decimal expansion of (Pi*e)^3.
 * @author Georg Fischer
 */
public class A092138 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.pow(CR.PI.multiply(CR.E), CR.THREE);

  @Override
  protected CR getCR() {
    return N;
  }
}
