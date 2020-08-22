package irvine.oeis.a177;
// Generated by gen_seq4.pl dex CR.valueOf(221).sqrt() true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A177157 Decimal expansion of sqrt(221).
 * @author Georg Fischer
 */
public class A177157 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(221).sqrt();

  @Override
  protected CR getCR() {
    return N;
  }
}
