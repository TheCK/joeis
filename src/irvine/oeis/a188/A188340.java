package irvine.oeis.a188;
// Generated by gen_seq4.pl dex CR.ONE.subtract(CR.ONE.divide(CR.PI)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A188340 Decimal expansion of 1 - 1/Pi.
 * @author Georg Fischer
 */
public class A188340 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A188340() {
    super(CR.ONE.subtract(CR.ONE.divide(CR.PI)));
  }
}
