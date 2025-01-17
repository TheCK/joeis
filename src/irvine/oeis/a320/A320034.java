package irvine.oeis.a320;
// Generated by gen_seq4.pl holos [0,-1,0,-1,0,0,0,1,0,1] [1,1,1,2,3,3,5,6,7,7,6,9,11,8,8,9,11,9,11,9,12,9,8,9,14,6,9,5,11,6,11,4,12,5,8,4,14,5,9,3,11,5,11,3] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A320034 a(n) is the number of integer partitions of n with largest part &lt;= 6 for which the index of the seaweed algebra formed by the integer partition paired with its weight is 0.
 * @author Georg Fischer
 */
public class A320034 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A320034() {
    super(1, "[0,-1,0,-1,0,0,0,1,0,1]", "[1,1,1,2,3,3,5,6,7,7,6,9,11,8,8,9,11,9,11,9,12,9,8,9,14,6,9,5,11,6,11,4,12,5,8,4,14,5,9,3,11,5,11,3]", 0);
  }
}
