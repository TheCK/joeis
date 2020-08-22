package irvine.oeis.a197;
// Generated by gen_seq4.pl dex CR.TAU.divide(CR.TWO.add(CR.PI)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A197727 Decimal expansion of 2*Pi/(2+Pi).
 * @author Georg Fischer
 */
public class A197727 extends DecimalExpansionSequence {

  private static final CR N = CR.TAU.divide(CR.TWO.add(CR.PI));

  @Override
  protected CR getCR() {
    return N;
  }
}
