package irvine.oeis.a116;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.E, CR.TWO) true 2 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A116938 Expansion of e^2 in base 2.
 * @author Georg Fischer
 */
public class A116938 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A116938() {
    super(0, CR.E.multiply(CR.E), 2);
  }
}
