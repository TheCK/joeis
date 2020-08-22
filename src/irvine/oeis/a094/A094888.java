package irvine.oeis.a094;
// Generated by gen_seq4.pl dex CR.TAU.multiply(CR.PHI) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A094888 Decimal expansion of 2*Pi*phi, where phi = (1+sqrt(5))/2.
 * @author Georg Fischer
 */
public class A094888 extends DecimalExpansionSequence {

  private static final CR N = CR.TAU.multiply(CR.PHI);

  @Override
  protected CR getCR() {
    return N;
  }
}
