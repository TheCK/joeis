package irvine.oeis.a075;
// Generated by gen_seq4.pl dex CR.NINE.subtract(CR.valueOf(12).multiply(CR.TWO.log())) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A075549 Decimal expansion of 9 - 12*log(2).
 * @author Georg Fischer
 */
public class A075549 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A075549() {
    super(CR.NINE.subtract(CR.valueOf(12).multiply(CR.TWO.log())));
  }
}
