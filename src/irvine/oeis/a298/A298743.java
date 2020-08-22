package irvine.oeis.a298;
// Generated by gen_seq4.pl dex CR.HALF.multiply(CR.ONE.add(CR.ONE.add(CR.FOUR.multiply(CR.THREE.sqrt())).sqrt())) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A298743 Decimal expansion of (1/2)(1 + sqrt(1 + 4*sqrt(3))).
 * @author Georg Fischer
 */
public class A298743 extends DecimalExpansionSequence {

  private static final CR N = CR.HALF.multiply(CR.ONE.add(CR.ONE.add(CR.FOUR.multiply(CR.THREE.sqrt())).sqrt()));

  @Override
  protected CR getCR() {
    return N;
  }
}
