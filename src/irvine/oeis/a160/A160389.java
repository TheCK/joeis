package irvine.oeis.a160;
// Generated by gen_seq4.pl dex CR.TWO.multiply(CR.PI.divide(CR.SEVEN).cos()) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A160389 Decimal expansion of 2*cos(Pi/7).
 * @author Georg Fischer
 */
public class A160389 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.multiply(CR.PI.divide(CR.SEVEN).cos());

  @Override
  protected CR getCR() {
    return N;
  }
}
