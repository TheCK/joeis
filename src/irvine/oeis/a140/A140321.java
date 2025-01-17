package irvine.oeis.a140;
// Generated by gen_seq4.pl decexp at 2021-07-27 22:38

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;
/**
 * A140321 Decimal expansion of x-coordinate of fixed point of Henon Map for a=7/5 and b=3/10 where x is a positive.
 * Formula: (sqrt(609)-7)/28
 * @author Georg Fischer
 */
public class A140321 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A140321() {
    super(0, CR.valueOf(609).sqrt().subtract(CR.SEVEN).divide(CR.valueOf(28)));
  }
}
