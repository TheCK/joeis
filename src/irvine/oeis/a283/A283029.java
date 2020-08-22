package irvine.oeis.a283;
// Generated by gen_seq4.pl holos [[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-1,0,0,0,0,0,0,0,0,0,-1],[2]] [0,1] 0 at 2020-03-14 22:45
// Recurrence: 2*a[n+0]=n^15*(n^2+1)*(n^8-n^6+n^4-n^2+1)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A283029 Number of inequivalent 5 X 5 matrices with entries in {1,2,3,..,n} when a matrix and its transpose are considered equivalent.
 * @author Georg Fischer
 */
public class A283029 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A283029() {
    super(0, "[[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-1,0,0,0,0,0,0,0,0,0,-1],[2]]", "[0,1]", 0);
  }
}
