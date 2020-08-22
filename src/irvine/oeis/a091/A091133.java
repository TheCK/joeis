package irvine.oeis.a091;
// Generated by gen_seq4.pl dexcr CR.THREE.multiply(CR.E).divide(CR.TWO).subtract(CR.THREE.multiply(REALS.pow(CR.E, CR.TWO))).add(REALS.pow(CR.E, CR.THREE)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A091133 Decimal expansion of (3*e)/2 - 3*e^2 + e^3.
 * @author Georg Fischer
 */
public class A091133 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = CR.THREE.multiply(CR.E).divide(CR.TWO).subtract(CR.THREE.multiply(REALS.pow(CR.E, CR.TWO))).add(REALS.pow(CR.E, CR.THREE));

  @Override
  protected CR getCR() {
    return N;
  }
}
