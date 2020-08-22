package irvine.oeis.a237;
// Generated by gen_seq4.pl dex CR.PI.subtract(CR.PHI) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A237200 Decimal expansion of Pi - phi.
 * @author Georg Fischer
 */
public class A237200 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.subtract(CR.PHI);

  @Override
  protected CR getCR() {
    return N;
  }
}
