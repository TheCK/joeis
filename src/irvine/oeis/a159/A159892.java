package irvine.oeis.a159;
// Generated by gen_seq4.pl dexcr CR.valueOf(450483).add(CR.valueOf(287918).multiply(CR.SQRT2)).divide(REALS.pow(CR.valueOf(439), CR.TWO)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A159892 Decimal expansion of (450483+287918*sqrt(2))/439^2.
 * @author Georg Fischer
 */
public class A159892 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = CR.valueOf(450483).add(CR.valueOf(287918).multiply(CR.SQRT2)).divide(REALS.pow(CR.valueOf(439), CR.TWO));

  @Override
  protected CR getCR() {
    return N;
  }
}
