package irvine.oeis.a332;
// Generated by gen_seq4.pl holos [[0],[512],[-1152],[1056],[-504],[132],[-18],[1]] [0,3,30,210,1260,6944,36288] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=18*a[n-1]-132*a[n-2]+504*a[n-3]-1056*a[n-4]+1152*a[n-5]-512*a[n-6]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A332426 Number of unordered pairs of non-selfintersecting paths with nodes that cover all vertices of a convex n-gon.
 * @author Georg Fischer
 */
public class A332426 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A332426() {
    super(3, "[[0],[512],[-1152],[1056],[-504],[132],[-18],[1]]", "[0,3,30,210,1260,6944,36288]", 0);
  }
}
