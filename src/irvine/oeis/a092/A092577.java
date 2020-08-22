package irvine.oeis.a092;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.E, CR.ZERO.subtract(CR.SIX)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A092577 Decimal expansion of e^(-6).
 * @author Georg Fischer
 */
public class A092577 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.pow(CR.E, CR.ZERO.subtract(CR.SIX));

  @Override
  protected CR getCR() {
    return N;
  }
}
