package irvine.oeis.a137;
// Generated by gen_seq4.pl dexcr REALS.acos(CR.ONE_THIRD) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A137914 Decimal expansion of arccos(1/3).
 * @author Georg Fischer
 */
public class A137914 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.acos(CR.ONE_THIRD);

  @Override
  protected CR getCR() {
    return N;
  }
}
