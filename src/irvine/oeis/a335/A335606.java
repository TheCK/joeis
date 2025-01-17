package irvine.oeis.a335;
// Generated by gen_seq4.pl holos at 2021-06-02 19:27
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A335606 The number of fixed n-ominoes with a convex hull of width 3.
 * Lin.rec. signature: (5,-6,-4, 8, 1, 2,-8, 0,-1, 9,-2,-1,-3, 1)
 * @author Georg Fischer
 */
public class A335606 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A335606() {
    super(3, "[0, 1,-3,-1,-2, 9,-1, 0,-8, 2, 1, 8,-4,-6, 5,-1]", "1, 8, 31, 95, 269, 721, 1866, 4728, 11804, 29162, 71502, 174342, 423341, 1024786, 2474934, 5966625, 14365256, 34550674, 83035396, 199440433", 0);
  }
}
