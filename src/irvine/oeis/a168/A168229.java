package irvine.oeis.a168;
// Generated by gen_seq4.pl dexcr REALS.atan(CR.SEVEN.sqrt()) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A168229 Decimal expansion of arctan(sqrt(7)).
 * @author Georg Fischer
 */
public class A168229 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.atan(CR.SEVEN.sqrt());

  @Override
  protected CR getCR() {
    return N;
  }
}
