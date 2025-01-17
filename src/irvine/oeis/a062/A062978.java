package irvine.oeis.a062;
// Generated by gen_seq4.pl cofr at 2021-07-23 19:30

import irvine.oeis.cons.ContinuedFractionSequence;
import irvine.oeis.a094.A094886;

/**
 * A062978 Continued fraction for Pi * (1 + sqrt 5)/2.
 * @author Georg Fischer
 */
public class A062978 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A062978() {
    super(new A094886());
  }
}
