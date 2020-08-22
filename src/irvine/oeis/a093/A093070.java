package irvine.oeis.a093;
// Generated by gen_seq4.pl dex CR.valueOf(128).divide(CR.valueOf(45).multiply(CR.PI)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A093070 Decimal expansion of 128/(45*Pi).
 * @author Georg Fischer
 */
public class A093070 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(128).divide(CR.valueOf(45).multiply(CR.PI));

  @Override
  protected CR getCR() {
    return N;
  }
}
