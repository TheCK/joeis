package irvine.oeis.a102;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.PI.multiply(CR.valueOf(163).sqrt()), CR.E) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A102645 Decimal expansion of (Pi*sqrt(163))^e.
 * @author Georg Fischer
 */
public class A102645 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.pow(CR.PI.multiply(CR.valueOf(163).sqrt()), CR.E);

  @Override
  protected CR getCR() {
    return N;
  }
}
