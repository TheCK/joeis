package irvine.oeis.a109;
// Generated by gen_seq4.pl holos [[0],[-3,1],[-9,6],[0,1]] [1,3,-4] 0 at 2020-02-15 22:07
// Recurrence: n*a[n+0]+3*(2*n-3)*a[n-1]+(n-3)*a[n-2]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A109771 G.f.: sqrt(1+6*x+x^2).
 * @author Georg Fischer
 */
public class A109771 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A109771() {
    super(0, "[[0],[-3,1],[-9,6],[0,1]]", "[1,3,-4]", 0);
  }
}
