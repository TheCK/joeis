package irvine.oeis.a157;
// Generated by gen_seq4.pl dex CR.valueOf(18).subtract(CR.FIVE.multiply(CR.SQRT2)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A157215 Decimal expansion of 18 - 5*sqrt(2).
 * @author Georg Fischer
 */
public class A157215 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A157215() {
    super(CR.valueOf(18).subtract(CR.FIVE.multiply(CR.SQRT2)));
  }
}
