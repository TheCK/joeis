package irvine.oeis.a105;
// Generated by gen_seq4.pl dexcr REALS.atan(CR.ONE.divide(CR.FIVE)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A105532 Decimal expansion of arctan(1/5).
 * @author Georg Fischer
 */
public class A105532 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A105532() {
    super(REALS.atan(CR.ONE.divide(CR.FIVE)));
  }
}
