package irvine.oeis.a260;
// Generated by gen_seq4.pl dex CR.E.multiply(CR.E).add(CR.FOUR.multiply(CR.PI)).sqrt().subtract(CR.E).divide(CR.TWO) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A260800 Decimal expansion of (sqrt(e*e+4*Pi)-e)/2.
 * @author Georg Fischer
 */
public class A260800 extends DecimalExpansionSequence {

  private static final CR N = CR.E.multiply(CR.E).add(CR.FOUR.multiply(CR.PI)).sqrt().subtract(CR.E).divide(CR.TWO);

  @Override
  protected CR getCR() {
    return N;
  }
}
