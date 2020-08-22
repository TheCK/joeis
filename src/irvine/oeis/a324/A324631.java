package irvine.oeis.a324;
// Generated by gen_seq4.pl holos [0,1,2,1,-1,-2,1] [15,31,60,113,215] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A324631 Number of permutations p of [n] such that four is the maximum of the number of elements in any integer interval [p(i)..i+n*[i&lt;p(i)]].
 * @author Georg Fischer
 */
public class A324631 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A324631() {
    super(1, "[0,1,2,1,-1,-2,1]", "[15,31,60,113,215]", 0);
  }
}
