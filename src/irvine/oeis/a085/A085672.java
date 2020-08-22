package irvine.oeis.a085;
// Generated by gen_seq4.pl dex CR.ONE.add(CR.ONE.add(CR.ONE.exp()).log()).log() true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A085672 Decimal expansion of log(1 + log(1 + exp(1))).
 * @author Georg Fischer
 */
public class A085672 extends DecimalExpansionSequence {

  private static final CR N = CR.ONE.add(CR.ONE.add(CR.ONE.exp()).log()).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
