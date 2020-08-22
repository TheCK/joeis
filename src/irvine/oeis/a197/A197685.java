package irvine.oeis.a197;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.PI, CR.TWO).divide(CR.FOUR.add(CR.TAU)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A197685 Decimal expansion of (pi^2)/(4+2*pi).
 * @author Georg Fischer
 */
public class A197685 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.pow(CR.PI, CR.TWO).divide(CR.FOUR.add(CR.TAU));

  @Override
  protected CR getCR() {
    return N;
  }
}
