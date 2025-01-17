package irvine.oeis.a085;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.E, CR.valueOf(1000)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A085678 Decimal expansion of e^1000.
 * @author Georg Fischer
 */
public class A085678 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A085678() {
    super(REALS.pow(CR.E, CR.valueOf(1000)));
  }
}
