package irvine.oeis.a171;
// Generated by gen_seq4.pl dex CR.THREE.divide(CR.valueOf(14)).sqrt() true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A171547 Decimal expansion of sqrt(3/14).
 * @author Georg Fischer
 */
public class A171547 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.divide(CR.valueOf(14)).sqrt();

  @Override
  protected CR getCR() {
    return N;
  }
}
