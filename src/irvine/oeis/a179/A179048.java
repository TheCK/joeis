package irvine.oeis.a179;
// Generated by gen_seq4.pl dex CR.valueOf(25).multiply(CR.THREE.sqrt()).divide(CR.FOUR) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A179048 Decimal expansion of 25*sqrt(3)/4, Area of equilateral triangle of side 5.
 * @author Georg Fischer
 */
public class A179048 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(25).multiply(CR.THREE.sqrt()).divide(CR.FOUR);

  @Override
  protected CR getCR() {
    return N;
  }
}
