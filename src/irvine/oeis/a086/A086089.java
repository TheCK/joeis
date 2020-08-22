package irvine.oeis.a086;
// Generated by gen_seq4.pl dex CR.THREE.multiply(CR.THREE.sqrt()).divide(CR.TAU) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A086089 Decimal expansion of 3*sqrt(3)/(2*Pi).
 * @author Georg Fischer
 */
public class A086089 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.multiply(CR.THREE.sqrt()).divide(CR.TAU);

  @Override
  protected CR getCR() {
    return N;
  }
}
