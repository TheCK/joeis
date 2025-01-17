package irvine.oeis.a073;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.ONE.divide(CR.PI), CR.PI) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A073239 Decimal expansion of (1/Pi)^Pi.
 * @author Georg Fischer
 */
public class A073239 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A073239() {
    super(REALS.pow(CR.ONE.divide(CR.PI), CR.PI));
  }
}
