package irvine.oeis.a193;
// Generated by gen_seq4.pl dexcr CR.PI.multiply(Zeta.zeta(3)).divide(CR.FOUR) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.Zeta;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A193712 Decimal expansion of Pi*zeta(3)/4.
 * @author Georg Fischer
 */
public class A193712 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = CR.PI.multiply(Zeta.zeta(3)).divide(CR.FOUR);

  @Override
  protected CR getCR() {
    return N;
  }
}
