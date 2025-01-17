package irvine.oeis.a096;
// Generated by gen_seq4.pl dexcr CR.ZERO.subtract(CR.EIGHT.multiply((CR.GAMMA).subtract(CR.TWO.log())).divide(CR.THREE)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A096429 Decimal expansion of -(8*(EulerGamma - log(2)))/3.
 * @author Georg Fischer
 */
public class A096429 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A096429() {
    super(CR.ZERO.subtract(CR.EIGHT.multiply((CR.GAMMA).subtract(CR.TWO.log())).divide(CR.THREE)));
  }
}
