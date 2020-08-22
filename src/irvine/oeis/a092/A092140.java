package irvine.oeis.a092;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.PI.multiply(CR.E), CR.FOUR) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A092140 Decimal expansion of (Pi*e)^4.
 * @author Georg Fischer
 */
public class A092140 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.pow(CR.PI.multiply(CR.E), CR.FOUR);

  @Override
  protected CR getCR() {
    return N;
  }
}
