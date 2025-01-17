package irvine.oeis.a180;
// Generated by gen_seq4.pl holos [[0],[1],[-1],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[-1],[1]] [1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=+a[n-1]+a[n-26]-a[n-27]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A180004 a(n) is the nearest integer to n*(27/26).
 * @author Georg Fischer
 */
public class A180004 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A180004() {
    super(1, "[[0],[1],[-1],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[-1],[1]]", "[1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29]", 0);
  }
}
