package irvine.oeis.a157;
// Generated by gen_seq4.pl dex CR.TWO.multiply(CR.HALF.add(CR.ONE.divide(CR.SQRT2)).log()) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A157699 Decimal expansion of 2*log(1/2 + 1/sqrt(2)).
 * @author Georg Fischer
 */
public class A157699 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.multiply(CR.HALF.add(CR.ONE.divide(CR.SQRT2)).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
