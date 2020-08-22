package irvine.oeis.a243;
// Generated by gen_seq4.pl dex CR.ONE.subtract(CR.NINE.divide(CR.FOUR.multiply(CR.PI))).add(CR.THREE.sqrt().divide(CR.TAU)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A243447 Decimal expansion of 1-9/(4*Pi)+sqrt(3)/(2*Pi), an extreme value constant.
 * @author Georg Fischer
 */
public class A243447 extends DecimalExpansionSequence {

  private static final CR N = CR.ONE.subtract(CR.NINE.divide(CR.FOUR.multiply(CR.PI))).add(CR.THREE.sqrt().divide(CR.TAU));

  @Override
  protected CR getCR() {
    return N;
  }
}
