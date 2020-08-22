package irvine.oeis.a307;
// Generated by gen_seq4.pl holos [[0],[100],[0],[0],[-101],[0],[0],[1]] [0,1,98,99,100,9998,9999] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=101*a[n-3]-100*a[n-6]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A307371 Numbers k such that the digits of sqrt(k) begin with k.
 * @author Georg Fischer
 */
public class A307371 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A307371() {
    super(1, "[[0],[100],[0],[0],[-101],[0],[0],[1]]", "[0,1,98,99,100,9998,9999]", 0);
  }
}
