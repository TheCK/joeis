package irvine.oeis.a142;
// Generated by gen_seq4.pl holos [[0],[0, 0, 0, 0, 1],[-7,-2,-2],[1]] [0, 1] 1 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A142997 a(0) = 0, a(1) = 1, a(n+1) = (2*n^2+2*n+13)*a(n) - n^4*a(n-1).
 * @author Georg Fischer
 */
public class A142997 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A142997() {
    super(0, "[[0],[0, 0, 0, 0, 1],[-13,-2,-2],[1]]", "[0, 1]", 1);
  }
}
