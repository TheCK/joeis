package irvine.oeis.a176;
// Generated by gen_seq4.pl dex CR.valueOf(15).add(CR.FOUR.multiply(CR.valueOf(15).sqrt())).divide(CR.THREE) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A176533 Decimal expansion of (15+4*sqrt(15))/3.
 * @author Georg Fischer
 */
public class A176533 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A176533() {
    super(CR.valueOf(15).add(CR.FOUR.multiply(CR.valueOf(15).sqrt())).divide(CR.THREE));
  }
}
