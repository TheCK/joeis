package irvine.oeis.a176;
// Generated by gen_seq4.pl dex CR.THREE.add(CR.TWO.multiply(CR.THREE.sqrt())).divide(CR.THREE) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A176053 Decimal expansion of (3+2*sqrt(3))/3.
 * @author Georg Fischer
 */
public class A176053 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.add(CR.TWO.multiply(CR.THREE.sqrt())).divide(CR.THREE);

  @Override
  protected CR getCR() {
    return N;
  }
}
