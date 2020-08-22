package irvine.oeis.a120;
// Generated by gen_seq4.pl dex CR.THREE.add(CR.SQRT2.divide(CR.TEN)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A120731 Decimal expansion of 3 + sqrt(2)/10.
 * @author Georg Fischer
 */
public class A120731 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.add(CR.SQRT2.divide(CR.TEN));

  @Override
  protected CR getCR() {
    return N;
  }
}
