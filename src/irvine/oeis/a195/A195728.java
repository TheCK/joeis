package irvine.oeis.a195;
// Generated by gen_seq4.pl dexcr REALS.atan(CR.SIX.sqrt()) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A195728 Decimal expansion of arctan(sqrt(6)).
 * @author Georg Fischer
 */
public class A195728 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.atan(CR.SIX.sqrt());

  @Override
  protected CR getCR() {
    return N;
  }
}
