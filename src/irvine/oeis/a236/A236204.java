package irvine.oeis.a236;
// Generated by gen_seq4.pl holos [[0],[1],[-1],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[-1],[1]] [1,5,7,13,17,19,23,25,29,31,35,37,41,43,47,49,53,59,61,65,67,71] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=a[n-1]+a[n-20]-a[n-21]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A236204 Numbers not divisible by 2, 3 or 11.
 * @author Georg Fischer
 */
public class A236204 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A236204() {
    super(1, "[[0],[1],[-1],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[-1],[1]]", "[1,5,7,13,17,19,23,25,29,31,35,37,41,43,47,49,53,59,61,65,67,71]", 0);
  }
}
