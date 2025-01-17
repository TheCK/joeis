package irvine.oeis.a329;
// Generated by gen_seq4.pl cofr at 2021-08-28 09:31

import irvine.oeis.cons.ContinuedFractionSequence;
import irvine.oeis.a328.A328906;
/**
 * A329336 Continued fraction of A328906 = 0.4895363211996..., solution to 1 + 2^x = 6^x.
 * @author Georg Fischer
 */
public class A329336 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A329336() {
    super(new A328906());
  }
}
