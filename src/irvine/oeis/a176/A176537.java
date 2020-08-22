package irvine.oeis.a176;
// Generated by gen_seq4.pl dex CR.FIVE.add(CR.valueOf(26).sqrt()) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A176537 Decimal expansion of 5+sqrt(26).
 * @author Georg Fischer
 */
public class A176537 extends DecimalExpansionSequence {

  private static final CR N = CR.FIVE.add(CR.valueOf(26).sqrt());

  @Override
  protected CR getCR() {
    return N;
  }
}
