package irvine.oeis.a080;
// Generated by gen_seq4.pl dexcr CR.ZERO.subtract(CR.GAMMA).exp() true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A080130 Decimal expansion of exp(-gamma).
 * @author Georg Fischer
 */
public class A080130 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A080130() {
    super(CR.ZERO.subtract(CR.GAMMA).exp());
  }
}
