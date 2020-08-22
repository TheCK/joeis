package irvine.oeis.a212;
// Generated by gen_seq4.pl holos [[0],[-1],[2],[2],[-6],[0],[6],[-2],[-2],[1]] [1,4,25,64,169,324,625,1024,1681] 0 at 2019-12-08 00:24
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A212893 Number of quadruples (w,x,y,z) with all terms in {0,...,n} such that w-x, x-y, and y-z all have the same parity.
 * @author Georg Fischer
 */
public class A212893 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A212893() {
    super(1, "[[0],[-1],[2],[2],[-6],[0],[6],[-2],[-2],[1]]", "[1,4,25,64,169,324,625,1024,1681]", 0);
  }
}
