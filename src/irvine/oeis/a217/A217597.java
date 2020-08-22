package irvine.oeis.a217;
// Generated by gen_seq4.pl dexcr EulerGamma.SINGLETON.exp().divide(CR.TWO) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.EulerGamma;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A217597 Decimal expansion of exp(gamma)/2.
 * @author Georg Fischer
 */
public class A217597 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = EulerGamma.SINGLETON.exp().divide(CR.TWO);

  @Override
  protected CR getCR() {
    return N;
  }
}
