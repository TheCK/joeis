package irvine.oeis.a060;
// Generated by gen_seq4.pl holos at 2021-07-06 21:47

import irvine.oeis.HolonomicRecurrence;

/**
 * A060060 Third column of triangle A060058.
 * 1/15*binomial(n+4, 4)*(20*n^2+88*n+75)
 * @author Georg Fischer
 */
public class A060060 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A060060() {
    super(0, "[[0],[-300,-427,-168,-20],[0, 7, 48, 20]]", "[5]", 0);
  }
}
