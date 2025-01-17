package irvine.oeis.a101;
// Generated by gen_seq4.pl dex CR.TWO.subtract(CR.SQRT2).sqrt() true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A101464 Decimal expansion of sqrt(2-sqrt(2)), edge length of a regular octagon with circumradius 1.
 * @author Georg Fischer
 */
public class A101464 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A101464() {
    super(CR.TWO.subtract(CR.SQRT2).sqrt());
  }
}
