package irvine.oeis.a178;
// Generated by gen_seq4.pl dex CR.valueOf(44310).sqrt() true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A178039 Decimal expansion of sqrt(44310).
 * @author Georg Fischer
 */
public class A178039 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(44310).sqrt();

  @Override
  protected CR getCR() {
    return N;
  }
}
