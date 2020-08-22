package irvine.oeis.a300;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.PI, CR.FOUR).divide(CR.valueOf(96)).subtract(CR.ONE).sqrt() true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A300731 Decimal expansion of sqrt(Pi^4/96 - 1).
 * @author Georg Fischer
 */
public class A300731 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.pow(CR.PI, CR.FOUR).divide(CR.valueOf(96)).subtract(CR.ONE).sqrt();

  @Override
  protected CR getCR() {
    return N;
  }
}
