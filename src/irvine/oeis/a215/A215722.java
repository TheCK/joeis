package irvine.oeis.a215;
// Generated by gen_seq4.pl dexcr CR.PI.multiply(CR.THREE.subtract(EulerGamma.SINGLETON)).divide(CR.valueOf(32)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.EulerGamma;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A215722 Decimal expansion of Pi*(3 - gamma)/32, where gamma is Euler's constant A001620.
 * @author Georg Fischer
 */
public class A215722 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = CR.PI.multiply(CR.THREE.subtract(EulerGamma.SINGLETON)).divide(CR.valueOf(32));

  @Override
  protected CR getCR() {
    return N;
  }
}
