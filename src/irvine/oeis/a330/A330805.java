package irvine.oeis.a330;
// Generated by gen_seq4.pl holos [[0],[-1],[5],[-10],[10],[-5],[1]] [0,9,51,166,410,855,1589] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=5*a[n-1]-10*a[n-2]+10*a[n-3]-5*a[n-4]+a[n-5]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A330805 Number of squares and rectangles in the interior of the square with vertices (n,0), (0,n), (-n,0) and (0,-n) in a square (x,y)-grid.
 * @author Georg Fischer
 */
public class A330805 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A330805() {
    super(0, "[[0],[-1],[5],[-10],[10],[-5],[1]]", "[0,9,51,166,410,855,1589]", 0);
  }
}
