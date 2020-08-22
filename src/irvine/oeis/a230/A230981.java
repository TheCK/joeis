package irvine.oeis.a230;
// Generated by gen_seq4.pl dexcr CR.THREE.divide(REALS.pow(CR.TWO, CR.HALF)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A230981 Decimal expansion of 3/(2^(1/2)).
 * @author Georg Fischer
 */
public class A230981 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = CR.THREE.divide(REALS.pow(CR.TWO, CR.HALF));

  @Override
  protected CR getCR() {
    return N;
  }
}
