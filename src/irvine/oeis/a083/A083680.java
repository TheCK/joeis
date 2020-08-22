package irvine.oeis.a083;
// Generated by gen_seq4.pl dex CR.THREE.divide(CR.TWO).multiply(CR.THREE.divide(CR.TWO).log()) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A083680 Decimal expansion of (3/2)*log(3/2).
 * @author Georg Fischer
 */
public class A083680 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.divide(CR.TWO).multiply(CR.THREE.divide(CR.TWO).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
