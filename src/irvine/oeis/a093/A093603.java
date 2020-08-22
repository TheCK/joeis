package irvine.oeis.a093;
// Generated by gen_seq4.pl dex CR.PI.divide(CR.THREE.sqrt()).sqrt().divide(CR.TWO) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A093603 Bisecting a triangular cake using a curved cut of minimal length: decimal expansion of sqrt(Pi/sqrt(3))/2 = d/2, where d^2 = Pi/sqrt(3).
 * @author Georg Fischer
 */
public class A093603 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.divide(CR.THREE.sqrt()).sqrt().divide(CR.TWO);

  @Override
  protected CR getCR() {
    return N;
  }
}
