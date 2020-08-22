package irvine.oeis.a197;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.PI, CR.FOUR).divide(CR.valueOf(120)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A197110 Decimal expansion of Pi^4/120.
 * @author Georg Fischer
 */
public class A197110 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.pow(CR.PI, CR.FOUR).divide(CR.valueOf(120));

  @Override
  protected CR getCR() {
    return N;
  }
}
