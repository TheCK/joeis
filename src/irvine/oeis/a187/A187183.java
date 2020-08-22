package irvine.oeis.a187;
// Generated by gen_seq4.pl holos [0,1,-1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-1,1] [1,1,1,1,1,2,2,2,2,2,3,3,3,3,3,4,4,4,4,4,5,6,5,6,5,6,5,6,5,6] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A187183 Parse the infinite string 012340123401234012340... into distinct phrases 0, 1, 2, 3, 4, 01, 23, 40, 12, ...; a(n) = length of n-th phrase.
 * @author Georg Fischer
 */
public class A187183 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A187183() {
    super(1, "[0,1,-1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-1,1]", "[1,1,1,1,1,2,2,2,2,2,3,3,3,3,3,4,4,4,4,4,5,6,5,6,5,6,5,6,5,6]", 0);
  }
}
