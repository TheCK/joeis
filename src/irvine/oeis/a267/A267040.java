package irvine.oeis.a267;
// Generated by gen_seq4.pl dexcr CR.EIGHT.sqrt().multiply(REALS.atan(CR.SQRT2.divide(CR.FIVE))) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A267040 Decimal expansion of sqrt(8)*arctan(sqrt(2)/5).
 * @author Georg Fischer
 */
public class A267040 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A267040() {
    super(CR.EIGHT.sqrt().multiply(REALS.atan(CR.SQRT2.divide(CR.FIVE))));
  }
}
