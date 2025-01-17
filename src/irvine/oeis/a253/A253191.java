package irvine.oeis.a253;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.TWO.log(), CR.TWO) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A253191 Decimal expansion of log(2)^2.
 * @author Georg Fischer
 */
public class A253191 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A253191() {
    super(REALS.pow(CR.TWO.log(), CR.TWO));
  }
}
