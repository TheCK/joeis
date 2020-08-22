package irvine.oeis.a034;
// Generated by gen_seq4.pl holos [[0],[0,-5],[1]] [1] 0 at 2020-02-15 22:07
// Recurrence: a[n]-(5*n-0)*a[n-1]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A034325 a(n) = n-th quintic factorial number divided by 5.
 * @author Georg Fischer
 */
public class A034325 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A034325() {
    super(1, "[[0],[0,-5],[1]]", "[1]", 0);
  }
}
