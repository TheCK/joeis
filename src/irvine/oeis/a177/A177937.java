package irvine.oeis.a177;
// Generated by gen_seq4.pl dex CR.valueOf(17791).sqrt() true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A177937 Decimal expansion of sqrt(17791).
 * @author Georg Fischer
 */
public class A177937 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(17791).sqrt();

  @Override
  protected CR getCR() {
    return N;
  }
}
