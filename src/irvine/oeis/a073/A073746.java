package irvine.oeis.a073;
// Generated by gen_seq4.pl dexcr REALS.sech(CR.ONE) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A073746 Decimal expansion of sech(1).
 * @author Georg Fischer
 */
public class A073746 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.sech(CR.ONE);

  @Override
  protected CR getCR() {
    return N;
  }
}
