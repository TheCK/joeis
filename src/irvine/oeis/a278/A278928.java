package irvine.oeis.a278;
// Generated by gen_seq4.pl dex CR.SQRT2.add(CR.ONE).sqrt() true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A278928 Decimal expansion of sqrt(sqrt(2) + 1).
 * @author Georg Fischer
 */
public class A278928 extends DecimalExpansionSequence {

  private static final CR N = CR.SQRT2.add(CR.ONE).sqrt();

  @Override
  protected CR getCR() {
    return N;
  }
}
