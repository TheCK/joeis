package irvine.oeis.a245;
// Generated by gen_seq4.pl dex CR.valueOf(28).multiply(CR.THREE.sqrt()).subtract(CR.valueOf(48)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A245670 Decimal expansion of 28*sqrt(3) - 48.
 * @author Georg Fischer
 */
public class A245670 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(28).multiply(CR.THREE.sqrt()).subtract(CR.valueOf(48));

  @Override
  protected CR getCR() {
    return N;
  }
}
