package irvine.oeis.a073;
// Generated by gen_seq4.pl dexcr REALS.pow((EulerGamma.SINGLETON), CR.ONE.exp()) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.EulerGamma;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A073018 Decimal expansion of gamma^(exp(1).
 * @author Georg Fischer
 */
public class A073018 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.pow(EulerGamma.SINGLETON, CR.ONE.exp());

  @Override
  protected CR getCR() {
    return N;
  }
}
