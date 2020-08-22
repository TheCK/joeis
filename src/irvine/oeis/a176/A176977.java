package irvine.oeis.a176;
// Generated by gen_seq4.pl dex CR.THREE.add(CR.valueOf(37).sqrt()).divide(CR.SEVEN) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A176977 Decimal expansion of (3+sqrt(37))/7.
 * @author Georg Fischer
 */
public class A176977 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.add(CR.valueOf(37).sqrt()).divide(CR.SEVEN);

  @Override
  protected CR getCR() {
    return N;
  }
}
