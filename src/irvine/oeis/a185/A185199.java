package irvine.oeis.a185;
// Generated by gen_seq4.pl dexcr CR.FOUR.divide(REALS.pow(CR.PI, CR.TWO)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A185199 Decimal expansion of 4/Pi^2.
 * @author Georg Fischer
 */
public class A185199 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A185199() {
    super(CR.FOUR.divide(REALS.pow(CR.PI, CR.TWO)));
  }
}
