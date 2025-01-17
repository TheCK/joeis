package irvine.oeis.a262;
// Generated by gen_seq4.pl holos at 2021-05-09 23:36
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A262394 a(n) = Sum_{k=1..n}(k*binomial(n,k-1)*binomial(2*n,n-k))/n.
 * @author Georg Fischer
 */
public class A262394 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A262394() {
    super(1, "[[0],[-12, 48,-27,-27],[0, 2, 6, 4]]", "[1, 4]", 0);
  }
}
