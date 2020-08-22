package irvine.oeis.a189;
// Generated by gen_seq4.pl dexcr CR.PI.subtract(CR.ZERO.subtract(CR.FOUR).add(REALS.pow(CR.PI, CR.TWO)).sqrt()).divide(CR.TWO) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A189044 Decimal expansion of (Pi-sqrt(-4+Pi^2))/2.
 * @author Georg Fischer
 */
public class A189044 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = CR.PI.subtract(CR.ZERO.subtract(CR.FOUR).add(REALS.pow(CR.PI, CR.TWO)).sqrt()).divide(CR.TWO);

  @Override
  protected CR getCR() {
    return N;
  }
}
