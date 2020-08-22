package irvine.oeis.a322;
// Generated by gen_seq4.pl dex CR.EIGHT.divide(CR.THREE.sqrt()).log() true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A322758 Decimal expansion of log(8/sqrt(3)).
 * @author Georg Fischer
 */
public class A322758 extends DecimalExpansionSequence {

  private static final CR N = CR.EIGHT.divide(CR.THREE.sqrt()).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
