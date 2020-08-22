package irvine.oeis.a176;
// Generated by gen_seq4.pl dex CR.THREE.add(CR.valueOf(21).sqrt()).divide(CR.SIX) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A176014 Decimal expansion of (3+sqrt(21))/6.
 * @author Georg Fischer
 */
public class A176014 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.add(CR.valueOf(21).sqrt()).divide(CR.SIX);

  @Override
  protected CR getCR() {
    return N;
  }
}
