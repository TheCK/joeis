package irvine.oeis.a205;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.PI, CR.PI.divide(CR.E)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A205528 Decimal expansion of Pi^(Pi/e).
 * @author Georg Fischer
 */
public class A205528 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.pow(CR.PI, CR.PI.divide(CR.E));

  @Override
  protected CR getCR() {
    return N;
  }
}
