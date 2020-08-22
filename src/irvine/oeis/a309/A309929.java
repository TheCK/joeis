package irvine.oeis.a309;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.PI, CR.valueOf(11)).divide(Zeta.zeta(11)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.Zeta;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A309929 Decimal expansion of Pi^11/Zeta(11).
 * @author Georg Fischer
 */
public class A309929 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.pow(CR.PI, CR.valueOf(11)).divide(Zeta.zeta(11));

  @Override
  protected CR getCR() {
    return N;
  }
}
