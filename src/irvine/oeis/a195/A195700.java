package irvine.oeis.a195;
// Generated by gen_seq4.pl dexcr REALS.asin(CR.THREE.divide(CR.EIGHT).sqrt()) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A195700 Decimal expansion of arcsin(sqrt(3/8)) and of arccos(sqrt(5/8)).
 * @author Georg Fischer
 */
public class A195700 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.asin(CR.THREE.divide(CR.EIGHT).sqrt());

  @Override
  protected CR getCR() {
    return N;
  }
}
