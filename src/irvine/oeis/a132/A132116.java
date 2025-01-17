package irvine.oeis.a132;
// Generated by gen_seq4.pl cofr at 2021-07-23 19:30

import irvine.oeis.cons.ContinuedFractionSequence;
import irvine.oeis.a093.A093602;

/**
 * A132116 Continued fraction expansion of Pi/sqrt(3) = sqrt(2*zeta(2)).
 * @author Georg Fischer
 */
public class A132116 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A132116() {
    super(new A093602());
  }
}
