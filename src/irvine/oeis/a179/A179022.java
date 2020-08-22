package irvine.oeis.a179;
// Generated by gen_seq4.pl dex CR.THREE.multiply(CR.valueOf(39).sqrt()).divide(CR.FOUR) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A179022 Decimal expansion of 3*sqrt(39)/4.
 * @author Georg Fischer
 */
public class A179022 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.multiply(CR.valueOf(39).sqrt()).divide(CR.FOUR);

  @Override
  protected CR getCR() {
    return N;
  }
}
