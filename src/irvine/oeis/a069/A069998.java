package irvine.oeis.a069;
// Generated by gen_seq4.pl dex CR.PI.divide(CR.TWO).sqrt() true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A069998 Decimal expansion of sqrt(Pi/2).
 * @author Georg Fischer
 */
public class A069998 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.divide(CR.TWO).sqrt();

  @Override
  protected CR getCR() {
    return N;
  }
}
