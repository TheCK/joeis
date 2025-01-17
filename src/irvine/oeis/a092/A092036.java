package irvine.oeis.a092;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.PI.multiply(CR.E), CR.TWO) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A092036 Decimal expansion of (Pi*e)^2.
 * @author Georg Fischer
 */
public class A092036 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A092036() {
    super(REALS.pow(CR.PI.multiply(CR.E), CR.TWO));
  }
}
