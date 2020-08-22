package irvine.oeis.a244;
// Generated by gen_seq4.pl dex CR.PI.divide(CR.valueOf(32)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A244978 Decimal expansion of Pi/32.
 * @author Georg Fischer
 */
public class A244978 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.divide(CR.valueOf(32));

  @Override
  protected CR getCR() {
    return N;
  }
}
