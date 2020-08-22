package irvine.oeis.a306;
// Generated by gen_seq4.pl holos [0,1,0,0,0,0,0,0,0,0,0,0,-2,0,0,0,0,0,0,0,0,0,0,1] [1,1,2,2,2,3,1,3,2,2,5,1,4,4,2,2,7,1,5,2,2,9,1,6] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A306399 a(1)=1; a(n) = number of occurrences of a(n-1) if a(n-1) is odd; a(n) = number of occurrences of a(n-2) if a(n-1) is even.
 * @author Georg Fischer
 */
public class A306399 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A306399() {
    super(1, "[0,1,0,0,0,0,0,0,0,0,0,0,-2,0,0,0,0,0,0,0,0,0,0,1]", "[1,1,2,2,2,3,1,3,2,2,5,1,4,4,2,2,7,1,5,2,2,9,1,6]", 0);
  }
}
