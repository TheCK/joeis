package irvine.oeis.a093;
// Generated by gen_seq4.pl dex CR.valueOf(24).multiply(CR.SQRT2).subtract(CR.SIX.multiply(CR.THREE.sqrt())).subtract(CR.TAU).multiply(CR.PI).divide(CR.valueOf(72)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A093824 Decimal expansion of (24*sqrt(2) - 6*sqrt(3) - 2*Pi)*Pi/72.
 * @author Georg Fischer
 */
public class A093824 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(24).multiply(CR.SQRT2).subtract(CR.SIX.multiply(CR.THREE.sqrt())).subtract(CR.TAU).multiply(CR.PI).divide(CR.valueOf(72));

  @Override
  protected CR getCR() {
    return N;
  }
}
