package irvine.oeis.a160;
// Generated by gen_seq4.pl dex CR.ONE.divide(CR.PHI.log()) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A160509 Decimal expansion of 1/log(phi).
 * @author Georg Fischer
 */
public class A160509 extends DecimalExpansionSequence {

  private static final CR N = CR.ONE.divide(CR.PHI.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
