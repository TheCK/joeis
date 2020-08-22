package irvine.oeis.a298;
// Generated by gen_seq4.pl dex CR.HALF.multiply(CR.ONE.add(CR.FIVE.add(CR.FOUR.multiply(CR.SQRT2)).sqrt())) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A298742 Decimal expansion of (1/2)(1 + sqrt(5 + 4*sqrt(2))).
 * @author Georg Fischer
 */
public class A298742 extends DecimalExpansionSequence {

  private static final CR N = CR.HALF.multiply(CR.ONE.add(CR.FIVE.add(CR.FOUR.multiply(CR.SQRT2)).sqrt()));

  @Override
  protected CR getCR() {
    return N;
  }
}
