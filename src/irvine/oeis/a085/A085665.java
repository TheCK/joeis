package irvine.oeis.a085;
// Generated by gen_seq4.pl dexcr REALS.tan(REALS.tan(CR.ONE)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A085665 Decimal expansion of tan(tan(1)).
 * @author Georg Fischer
 */
public class A085665 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.tan(REALS.tan(CR.ONE));

  @Override
  protected CR getCR() {
    return N;
  }
}
