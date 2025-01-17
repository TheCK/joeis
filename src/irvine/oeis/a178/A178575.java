package irvine.oeis.a178;
// Generated by gen_seq4.pl holos at 2021-07-04 22:36

import irvine.oeis.HolonomicRecurrence;

/**
 * A178575 Number of permutations of {1,2,...,3n} whose cycle lengths are all divisible by 3.
 * Recurrence: a(n) = (3*n-1)*(3*n-2)^2*a(n-1),a(0)=1.
 * @author Georg Fischer
 */
public class A178575 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A178575() {
    super(0, "[[0],[-4, 24,-45, 27],[-1]]", "[1]", 0);
  }
}
