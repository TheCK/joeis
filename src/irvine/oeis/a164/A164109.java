package irvine.oeis.a164;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.PI, CR.FOUR).divide(CR.THREE) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A164109 Decimal expansion of Pi^4/3.
 * @author Georg Fischer
 */
public class A164109 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A164109() {
    super(REALS.pow(CR.PI, CR.FOUR).divide(CR.THREE));
  }
}
