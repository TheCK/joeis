package irvine.oeis.a091;
// Generated by gen_seq4.pl dex CR.TWO.multiply(CR.valueOf(18).add(CR.THREE.sqrt().multiply(CR.PI))).divide(CR.valueOf(27)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A091682 Decimal expansion of 2*(18 + sqrt(3)*Pi)/27.
 * @author Georg Fischer
 */
public class A091682 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.multiply(CR.valueOf(18).add(CR.THREE.sqrt().multiply(CR.PI))).divide(CR.valueOf(27));

  @Override
  protected CR getCR() {
    return N;
  }
}
