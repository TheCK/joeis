package irvine.oeis.a160;
// Generated by gen_seq4.pl dex CR.THREE.sqrt().subtract(CR.ONE) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A160390 Decimal expansion of sqrt(3) - 1.
 * @author Georg Fischer
 */
public class A160390 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.sqrt().subtract(CR.ONE);

  @Override
  protected CR getCR() {
    return N;
  }
}
