package irvine.oeis.a187;
// Generated by gen_seq4.pl holos [0,1,-1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-1,1] [1,1,1,1,1,1,1,2,2,2,2,2,2,2,3,3,3,3,3,3,3,4,4,4,4,4,4,4,5,5,5,5,5,5,5,6,6,6,6,6,6,6,7,8,7,8,7,8,7,8,7,8,7,8,7,8] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A187185 Parse the infinite string 0123456012345601234560... into distinct phrases 0, 1, 2, 3, 4, 5, 6, 01, 23, 45, 60, 12, 34, 56, 012, ...; a(n) = length of n-th phrase.
 * @author Georg Fischer
 */
public class A187185 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A187185() {
    super(1, "[0,1,-1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-1,1]", "[1,1,1,1,1,1,1,2,2,2,2,2,2,2,3,3,3,3,3,3,3,4,4,4,4,4,4,4,5,5,5,5,5,5,5,6,6,6,6,6,6,6,7,8,7,8,7,8,7,8,7,8,7,8,7,8]", 0);
  }
}
