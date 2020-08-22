package irvine.oeis.a305;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.PI.divide(CR.TWO.log()), CR.TWO).divide(CR.valueOf(12)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A305607 Decimal expansion of (Pi/log(2))^2/12.
 * @author Georg Fischer
 */
public class A305607 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.pow(CR.PI.divide(CR.TWO.log()), CR.TWO).divide(CR.valueOf(12));

  @Override
  protected CR getCR() {
    return N;
  }
}
