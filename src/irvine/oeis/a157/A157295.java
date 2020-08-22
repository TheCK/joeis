package irvine.oeis.a157;
// Generated by gen_seq4.pl dexcr CR.valueOf(630).divide(REALS.pow(CR.PI, CR.SIX)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A157295 Decimal expansion of 630/Pi^6.
 * @author Georg Fischer
 */
public class A157295 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = CR.valueOf(630).divide(REALS.pow(CR.PI, CR.SIX));

  @Override
  protected CR getCR() {
    return N;
  }
}
