package irvine.oeis.a125;
// Generated by gen_seq4.pl dexcr CR.TWO.multiply(CR.ZERO.subtract(CR.GAMMA).exp()) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A125313 Decimal expansion of 2*exp(-gamma).
 * @author Georg Fischer
 */
public class A125313 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A125313() {
    super(CR.TWO.multiply(CR.ZERO.subtract(CR.GAMMA).exp()));
  }
}
