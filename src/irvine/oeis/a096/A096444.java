package irvine.oeis.a096;
// Generated by gen_seq4.pl dex CR.PI.subtract(CR.ONE).divide(CR.TWO) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A096444 Decimal expansion of (Pi - 1)/2.
 * @author Georg Fischer
 */
public class A096444 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.subtract(CR.ONE).divide(CR.TWO);

  @Override
  protected CR getCR() {
    return N;
  }
}
