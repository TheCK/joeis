package irvine.oeis.a159;
// Generated by gen_seq4.pl cofr at 2021-07-23 19:30

import irvine.oeis.cons.ContinuedFractionSequence;
import irvine.oeis.a073.A073233;

/**
 * A159824 Continued fraction for Pi^Pi (cf. A073233).
 * @author Georg Fischer
 */
public class A159824 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A159824() {
    super(new A073233());
  }
}
