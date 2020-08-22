package irvine.oeis.a323;
// Generated by gen_seq4.pl dexcr REALS.cosh(CR.PI.divide(CR.SIX)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A323982 Decimal expansion of cosh(Pi/6).
 * @author Georg Fischer
 */
public class A323982 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.cosh(CR.PI.divide(CR.SIX));

  @Override
  protected CR getCR() {
    return N;
  }
}
