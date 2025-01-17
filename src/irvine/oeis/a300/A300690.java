package irvine.oeis.a300;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.PI, CR.TWO).divide(CR.EIGHT).subtract(CR.ONE).sqrt() true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A300690 Decimal expansion of sqrt(Pi^2/8 - 1).
 * @author Georg Fischer
 */
public class A300690 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A300690() {
    super(REALS.pow(CR.PI, CR.TWO).divide(CR.EIGHT).subtract(CR.ONE).sqrt());
  }
}
