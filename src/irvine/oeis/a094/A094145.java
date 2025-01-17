package irvine.oeis.a094;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.E.divide(CR.PI), CR.ONE.divide(CR.valueOf(11))) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A094145 Decimal expansion of (e/Pi)^(1/11).
 * @author Georg Fischer
 */
public class A094145 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A094145() {
    super(REALS.pow(CR.E.divide(CR.PI), CR.ONE.divide(CR.valueOf(11))));
  }
}
