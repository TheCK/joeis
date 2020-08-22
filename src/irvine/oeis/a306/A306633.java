package irvine.oeis.a306;
// Generated by gen_seq4.pl dexcr Zeta.zeta(2).divide(Zeta.zeta(3)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.Zeta;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A306633 Decimal expansion of zeta(2)/zeta(3).
 * @author Georg Fischer
 */
public class A306633 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = Zeta.zeta(2).divide(Zeta.zeta(3));

  @Override
  protected CR getCR() {
    return N;
  }
}
