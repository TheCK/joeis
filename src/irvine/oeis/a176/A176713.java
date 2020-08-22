package irvine.oeis.a176;
// Generated by gen_seq4.pl dex CR.valueOf(4047).add(CR.valueOf(16394397).sqrt()).divide(CR.valueOf(142)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A176713 Decimal expansion of (4047+sqrt(16394397))/142.
 * @author Georg Fischer
 */
public class A176713 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(4047).add(CR.valueOf(16394397).sqrt()).divide(CR.valueOf(142));

  @Override
  protected CR getCR() {
    return N;
  }
}
