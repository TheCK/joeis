package irvine.oeis.a188;
// Generated by gen_seq4.pl dex CR.TWO.add(CR.valueOf(13).sqrt()).divide(CR.THREE) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A188655 Decimal expansion of (2+sqrt(13))/3.
 * @author Georg Fischer
 */
public class A188655 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.add(CR.valueOf(13).sqrt()).divide(CR.THREE);

  @Override
  protected CR getCR() {
    return N;
  }
}
