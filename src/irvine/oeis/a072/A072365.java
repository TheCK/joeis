package irvine.oeis.a072;
// Generated by gen_seq4.pl dexcr REALS.pow((CR.ONE_THIRD), CR.ONE.divide(CR.THREE)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A072365 Decimal expansion of (1/3)^(1/3).
 * @author Georg Fischer
 */
public class A072365 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A072365() {
    super(REALS.pow(CR.ONE_THIRD, CR.ONE.divide(CR.THREE)));
  }
}
