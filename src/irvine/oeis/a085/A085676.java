package irvine.oeis.a085;
// Generated by gen_seq4.pl dexcr CR.ZERO.subtract(REALS.pow(CR.TEN, CR.valueOf(50)).sin()) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A085676 Decimal expansion of -sin(10^50).
 * @author Georg Fischer
 */
public class A085676 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = CR.ZERO.subtract(REALS.pow(CR.TEN, CR.valueOf(50)).sin());

  @Override
  protected CR getCR() {
    return N;
  }
}
