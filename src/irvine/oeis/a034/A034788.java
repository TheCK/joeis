package irvine.oeis.a034;
// Generated by gen_seq4.pl holos [[0],[0,-6],[1]] [1] 0 at 2020-02-15 22:07
// Recurrence: a[n]-(6*n-0)*a[n-1]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A034788 a(n) is the n-th sextic factorial number divided by 6.
 * @author Georg Fischer
 */
public class A034788 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A034788() {
    super(1, "[[0],[0,-6],[1]]", "[1]", 0);
  }
}
