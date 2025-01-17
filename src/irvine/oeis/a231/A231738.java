package irvine.oeis.a231;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.ONE.divide(CR.PI), CR.ONE.divide(CR.E)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A231738 Decimal expansion of (1/Pi)^(1/e).
 * @author Georg Fischer
 */
public class A231738 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A231738() {
    super(REALS.pow(CR.ONE.divide(CR.PI), CR.ONE.divide(CR.E)));
  }
}
