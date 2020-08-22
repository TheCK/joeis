package irvine.oeis.a300;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.PI, CR.SIX).divide(CR.valueOf(960)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A300709 Decimal expansion of Pi^6/960.
 * @author Georg Fischer
 */
public class A300709 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.pow(CR.PI, CR.SIX).divide(CR.valueOf(960));

  @Override
  protected CR getCR() {
    return N;
  }
}
