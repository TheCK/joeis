package irvine.oeis.a177;
// Generated by gen_seq4.pl dex CR.valueOf(124).add(CR.valueOf(16926).sqrt()).divide(CR.valueOf(25)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A177015 Decimal expansion of (124+sqrt(16926))/25.
 * @author Georg Fischer
 */
public class A177015 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(124).add(CR.valueOf(16926).sqrt()).divide(CR.valueOf(25));

  @Override
  protected CR getCR() {
    return N;
  }
}
