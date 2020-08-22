package irvine.oeis.a118;
// Generated by gen_seq4.pl holos [[0],[0,3,-3],[0],[-1],[1]] [1,1,1,7] 1 at 2020-03-14 22:45
// Recurrence: a[n+1]=a[n+0]+3*n*(n-1)*a[n-2]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A118395 E.g.f.: exp(x + x^3).
 * @author Georg Fischer
 */
public class A118395 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A118395() {
    super(0, "[[0],[0,3,-3],[0],[-1],[1]]", "[1,1,1,7]", 1);
  }
}
