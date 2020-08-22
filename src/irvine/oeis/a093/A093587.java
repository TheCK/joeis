package irvine.oeis.a093;
// Generated by gen_seq4.pl dexcr CR.valueOf(35).divide(CR.valueOf(48).multiply(REALS.pow(CR.PI, CR.TWO))) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A093587 Decimal expansion of 35/(48*Pi^2).
 * @author Georg Fischer
 */
public class A093587 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = CR.valueOf(35).divide(CR.valueOf(48).multiply(REALS.pow(CR.PI, CR.TWO)));

  @Override
  protected CR getCR() {
    return N;
  }
}
