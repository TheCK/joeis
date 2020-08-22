package irvine.oeis.a195;
// Generated by gen_seq4.pl dexcr REALS.asin((CR.ONE_THIRD).sqrt()) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A195695 Decimal expansion of arcsin(sqrt(1/3)) and of arccos(sqrt(2/3)).
 * @author Georg Fischer
 */
public class A195695 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.asin((CR.ONE_THIRD).sqrt());

  @Override
  protected CR getCR() {
    return N;
  }
}
