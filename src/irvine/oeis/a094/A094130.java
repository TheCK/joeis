package irvine.oeis.a094;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.E.divide(CR.PI), CR.ONE.divide(CR.FOUR)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A094130 Decimal expansion of (e/Pi)^(1/4).
 * @author Georg Fischer
 */
public class A094130 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A094130() {
    super(REALS.pow(CR.E.divide(CR.PI), CR.ONE.divide(CR.FOUR)));
  }
}
