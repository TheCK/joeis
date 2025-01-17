package irvine.oeis.a092;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.PI, CR.ZERO.subtract(CR.EIGHT)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A092748 Decimal expansion of Pi^(-8).
 * @author Georg Fischer
 */
public class A092748 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A092748() {
    super(REALS.pow(CR.PI, CR.ZERO.subtract(CR.EIGHT)));
  }
}
