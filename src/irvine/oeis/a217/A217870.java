package irvine.oeis.a217;
// Generated by gen_seq4.pl dex CR.TWO.add(CR.THREE.sqrt()).sqrt().sqrt() true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A217870 Decimal expansion of sqrt(sqrt(2 + sqrt(3))).
 * @author Georg Fischer
 */
public class A217870 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.add(CR.THREE.sqrt()).sqrt().sqrt();

  @Override
  protected CR getCR() {
    return N;
  }
}
