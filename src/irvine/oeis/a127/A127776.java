package irvine.oeis.a127;
// Generated by gen_seq4.pl holos [[0],[-36,96,-64],[0,0,1]] [1,4,100] 0 at 2020-03-14 22:45
// Recurrence: n^2*a[n+0]=4*(4*n-3)^2*a[n-1]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A127776 a(n) = ( (2^n / n!) * Product_{k=0..n-1} (4*k + 1) )^2.
 * @author Georg Fischer
 */
public class A127776 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A127776() {
    super(0, "[[0],[-36,96,-64],[0,0,1]]", "[1,4,100]", 0);
  }
}
