package irvine.oeis.a085;
// Generated by gen_seq4.pl holos [[0,1,1,-1,0,0,-1],[2]] [0,0] 0 at 2020-03-14 22:45
// Recurrence: 2*a[n+0]=(n-1)*n*(n+1)*(n^3+n+1)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A085742 a(n) = T(n^3) - T(n), where T() are the triangular numbers (A000217).
 * @author Georg Fischer
 */
public class A085742 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A085742() {
    super(0, "[[0,1,1,-1,0,0,-1],[2]]", "[0,0]", 0);
  }
}
