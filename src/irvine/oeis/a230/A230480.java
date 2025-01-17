package irvine.oeis.a230;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.PI, CR.TWO).add(CR.SIX.multiply(CR.PI)).add(CR.ONE) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A230480 Decimal expansion of Pi^2+6*Pi+1.
 * @author Georg Fischer
 */
public class A230480 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A230480() {
    super(REALS.pow(CR.PI, CR.TWO).add(CR.SIX.multiply(CR.PI)).add(CR.ONE));
  }
}
