package irvine.oeis.a154;
// Generated by gen_seq4.pl dexcr REALS.pow(REALS.pow(CR.valueOf(640320), CR.THREE).add(CR.valueOf(744)).log().divide(CR.PI), CR.TWO) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154738 Decimal expansion of (log(640320^3 + 744)/Pi)^2.
 * @author Georg Fischer
 */
public class A154738 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A154738() {
    super(REALS.pow(REALS.pow(CR.valueOf(640320), CR.THREE).add(CR.valueOf(744)).log().divide(CR.PI), CR.TWO));
  }
}
