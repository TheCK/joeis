package irvine.oeis.a307;
// Generated by gen_seq4.pl dex CR.THREE.multiply(CR.HALF.exp()).subtract(CR.ONE).divide(CR.TWO) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A307229 Decimal expansion of (3*exp(1/2) - 1)/2.
 * @author Georg Fischer
 */
public class A307229 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.multiply(CR.HALF.exp()).subtract(CR.ONE).divide(CR.TWO);

  @Override
  protected CR getCR() {
    return N;
  }
}
