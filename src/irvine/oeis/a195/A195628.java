package irvine.oeis.a195;
// Generated by gen_seq4.pl dexcr REALS.atan(CR.FOUR) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A195628 Decimal expansion of arctan(4).
 * @author Georg Fischer
 */
public class A195628 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.atan(CR.FOUR);

  @Override
  protected CR getCR() {
    return N;
  }
}
