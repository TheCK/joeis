package irvine.oeis.a096;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.PI.subtract(CR.E), CR.ONE_THIRD) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A096435 Decimal expansion of (Pi - e)^(1/3).
 * @author Georg Fischer
 */
public class A096435 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A096435() {
    super(REALS.pow(CR.PI.subtract(CR.E), CR.ONE_THIRD));
  }
}
