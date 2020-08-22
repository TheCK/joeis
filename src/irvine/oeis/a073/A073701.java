package irvine.oeis.a073;
// Generated by gen_seq4.pl holos [[0],[-1,2,-1],[1,0,-1],[1]] [1,0] 0 at 2020-02-15 22:07
// Recurrence: a[n+0]=(n^2-1)*a[n-1]+(n-1)^2*a[n-2]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A073701 a(n) = n^2*a(n-1)+(-1)^n.
 * @author Georg Fischer
 */
public class A073701 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A073701() {
    super(0, "[[0],[-1,2,-1],[1,0,-1],[1]]", "[1,0]", 0);
  }
}
