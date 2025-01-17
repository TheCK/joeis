package irvine.oeis.a243;
// Generated by gen_seq4.pl holos [[0,-9,0,120,0,-432,0,576,0,-256],[1]] [0,1] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=n*(4*n^2-3)*(64*n^6-96*n^4+36*n^2-3)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A243135 256*n^9 - 576*n^7 + 432*n^5 - 120*n^3 + 9*n.
 * @author Georg Fischer
 */
public class A243135 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A243135() {
    super(0, "[[0,-9,0,120,0,-432,0,576,0,-256],[1]]", "[0,1]", 0);
  }
}
