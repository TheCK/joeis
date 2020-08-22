package irvine.oeis.a176;
// Generated by gen_seq4.pl dex CR.SIX.add(CR.valueOf(42).sqrt()).divide(CR.THREE) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A176216 Decimal expansion of (6+sqrt(42))/3.
 * @author Georg Fischer
 */
public class A176216 extends DecimalExpansionSequence {

  private static final CR N = CR.SIX.add(CR.valueOf(42).sqrt()).divide(CR.THREE);

  @Override
  protected CR getCR() {
    return N;
  }
}
