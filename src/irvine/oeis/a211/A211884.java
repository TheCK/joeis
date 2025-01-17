package irvine.oeis.a211;
// Generated by gen_seq4.pl decexp at 2021-07-13 19:05

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A211884 Decimal expansion of the imaginary part of -(i^e).
 * @author Georg Fischer
 */
public class A211884 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A211884() {
    super(0, CR.ZERO.subtract(CR.PI.multiply(CR.E).divide(CR.TWO).sin()));
  }
}
