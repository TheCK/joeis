package irvine.oeis.a210;
// Generated by gen_seq4.pl dex CR.TAU.divide(CR.valueOf(17)).cos() true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A210644 Decimal expansion of cos(2*Pi/17).
 * @author Georg Fischer
 */
public class A210644 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A210644() {
    super(CR.TAU.divide(CR.valueOf(17)).cos());
  }
}
