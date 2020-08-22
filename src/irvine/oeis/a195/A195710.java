package irvine.oeis.a195;
// Generated by gen_seq4.pl dexcr REALS.acos(CR.ZERO.subtract(CR.TWO.divide(CR.FIVE).sqrt())) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A195710 Decimal expansion of arccos(-sqrt(2/5)).
 * @author Georg Fischer
 */
public class A195710 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.acos(CR.ZERO.subtract(CR.TWO.divide(CR.FIVE).sqrt()));

  @Override
  protected CR getCR() {
    return N;
  }
}
