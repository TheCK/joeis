package irvine.oeis.a108;
// Generated by gen_seq4.pl holos [[0],[-1,1],[5,-5],[1]] [0,1,5,48] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=5*(n-1)*a[n-1]-(n-1)*a[n-2]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A108207 a(n)= 5*(n-1)*a(n-1) -(n-1)*a(n-2), with a(0)=0, a(1)=1.
 * @author Georg Fischer
 */
public class A108207 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A108207() {
    super(0, "[[0],[-1,1],[5,-5],[1]]", "[0,1,5,48]", 0);
  }
}
