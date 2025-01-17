package irvine.oeis.a277;
// Generated by gen_seq4.pl holos [[0],[-12,14,-4],[36,-45,13],[-12,23,-7],[0,-3,1]] [1,1,2,6,21] 0 at 2020-03-14 22:45
// Recurrence: n*(n-3)*a[n+0]+(-7*n^2+23*n-12)*a[n-1]+(13*n^2-45*n+36)*a[n-2]-2*(2*n-3)*(n-2)*a[n-3]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A277221 Number of permutations of length n which avoid the patterns 4123, 1324, and 3124.
 * @author Georg Fischer
 */
public class A277221 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A277221() {
    super(0, "[[0],[-12,14,-4],[36,-45,13],[-12,23,-7],[0,-3,1]]", "[1,1,2,6,21]", 0);
  }
}
