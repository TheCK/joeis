package irvine.oeis.a182;
// Generated by gen_seq4.pl dex CR.TWO.add(CR.THREE.sqrt()).log().divide(CR.FOUR) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A182023 Decimal expansion of log(2+sqrt(3))/4.
 * @author Georg Fischer
 */
public class A182023 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.add(CR.THREE.sqrt()).log().divide(CR.FOUR);

  @Override
  protected CR getCR() {
    return N;
  }
}
