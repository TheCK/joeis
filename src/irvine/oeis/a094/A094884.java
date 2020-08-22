package irvine.oeis.a094;
// Generated by gen_seq4.pl dex CR.PHI.divide(CR.SQRT2) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A094884 Decimal expansion of phi/sqrt(2), where phi = (1+sqrt(5))/2.
 * @author Georg Fischer
 */
public class A094884 extends DecimalExpansionSequence {

  private static final CR N = CR.PHI.divide(CR.SQRT2);

  @Override
  protected CR getCR() {
    return N;
  }
}
