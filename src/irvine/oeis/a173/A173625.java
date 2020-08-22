package irvine.oeis.a173;
// Generated by gen_seq4.pl dex CR.ZERO.subtract(CR.THREE.multiply(CR.ONE.subtract(CR.PI))) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A173625 Decimal expansion of -3(1 - Pi).
 * @author Georg Fischer
 */
public class A173625 extends DecimalExpansionSequence {

  private static final CR N = CR.ZERO.subtract(CR.THREE.multiply(CR.ONE.subtract(CR.PI)));

  @Override
  protected CR getCR() {
    return N;
  }
}
