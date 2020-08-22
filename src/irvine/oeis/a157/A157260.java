package irvine.oeis.a157;
// Generated by gen_seq4.pl dex CR.SEVEN.add(CR.TWO.multiply(CR.SQRT2)).divide(CR.SEVEN.subtract(CR.TWO.multiply(CR.SQRT2))) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A157260 Decimal expansion of (7 + 2*sqrt(2))/(7 - 2*sqrt(2)).
 * @author Georg Fischer
 */
public class A157260 extends DecimalExpansionSequence {

  private static final CR N = CR.SEVEN.add(CR.TWO.multiply(CR.SQRT2)).divide(CR.SEVEN.subtract(CR.TWO.multiply(CR.SQRT2)));

  @Override
  protected CR getCR() {
    return N;
  }
}
