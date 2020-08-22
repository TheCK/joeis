package irvine.oeis.a193;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.PI, CR.TWO).divide(CR.valueOf(12)).exp() true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A193548 Decimal expansion of exp(Pi^2/12).
 * @author Georg Fischer
 */
public class A193548 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.pow(CR.PI, CR.TWO).divide(CR.valueOf(12)).exp();

  @Override
  protected CR getCR() {
    return N;
  }
}
