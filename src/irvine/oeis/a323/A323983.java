package irvine.oeis.a323;
// Generated by gen_seq4.pl dexcr REALS.sinh(CR.PI.divide(CR.SIX)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A323983 Decimal expansion of sinh(Pi/6).
 * @author Georg Fischer
 */
public class A323983 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A323983() {
    super(REALS.sinh(CR.PI.divide(CR.SIX)));
  }
}
