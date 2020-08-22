package irvine.oeis.a176;
// Generated by gen_seq4.pl dex CR.SEVEN.add(CR.THREE.multiply(CR.SEVEN.sqrt())).divide(CR.TWO) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A176434 Decimal expansion of (7+3*sqrt(7))/2.
 * @author Georg Fischer
 */
public class A176434 extends DecimalExpansionSequence {

  private static final CR N = CR.SEVEN.add(CR.THREE.multiply(CR.SEVEN.sqrt())).divide(CR.TWO);

  @Override
  protected CR getCR() {
    return N;
  }
}
