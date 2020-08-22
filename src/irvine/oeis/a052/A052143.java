package irvine.oeis.a052;
// Generated by gen_seq4.pl holos [[0],[-4,4],[1,-4],[1]] [1,3,17] 0 at 2020-02-15 22:07
// Recurrence: a[n+0]-(4*n-1)*a[n-1]+4*(n-1)*a[n-2]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A052143 E.g.f.: exp(x)/sqrt(1-4*x).
 * @author Georg Fischer
 */
public class A052143 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A052143() {
    super(0, "[[0],[-4,4],[1,-4],[1]]", "[1,3,17]", 0);
  }
}
