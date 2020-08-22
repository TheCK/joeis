package irvine.oeis.a182;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.PI, CR.TWO).divide(CR.valueOf(15)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A182448 Decimal expansion of Pi^2/15.
 * @author Georg Fischer
 */
public class A182448 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.pow(CR.PI, CR.TWO).divide(CR.valueOf(15));

  @Override
  protected CR getCR() {
    return N;
  }
}
