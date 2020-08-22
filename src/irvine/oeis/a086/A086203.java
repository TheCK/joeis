package irvine.oeis.a086;
// Generated by gen_seq4.pl dexcr REALS.atan(CR.HALF).divide(CR.PI) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A086203 Decimal expansion of arctan(1/2)/Pi.
 * @author Georg Fischer
 */
public class A086203 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.atan(CR.HALF).divide(CR.PI);

  @Override
  protected CR getCR() {
    return N;
  }
}
