package irvine.oeis.a160;
// Generated by gen_seq4.pl dex CR.valueOf(107).add(CR.valueOf(42).multiply(CR.SQRT2)).divide(CR.valueOf(89)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A160056 Decimal expansion of (107+42*sqrt(2))/89.
 * @author Georg Fischer
 */
public class A160056 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(107).add(CR.valueOf(42).multiply(CR.SQRT2)).divide(CR.valueOf(89));

  @Override
  protected CR getCR() {
    return N;
  }
}
