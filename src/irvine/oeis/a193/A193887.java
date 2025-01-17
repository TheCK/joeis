package irvine.oeis.a193;
// Generated by gen_seq4.pl dex CR.PI.multiply(CR.SQRT2).divide(CR.EIGHT) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A193887 Decimal expansion of Pi * sqrt(2)/8.
 * @author Georg Fischer
 */
public class A193887 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A193887() {
    super(CR.PI.multiply(CR.SQRT2).divide(CR.EIGHT));
  }
}
