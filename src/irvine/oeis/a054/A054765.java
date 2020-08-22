package irvine.oeis.a054;
// Generated by gen_seq4.pl holos [[0],[-1,-2,-1],[-3,-2],[1]] [0,1,3,19] 2 at 2020-03-14 22:45
// Recurrence: a[n+2]=(2*n+3)*a[n+1]+(n+1)^2*a[n+0]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A054765 a(n+2) = (2n+3)*a(n+1) + (n+1)^2*a(n), a(0) = 0, a(1) = 1.
 * @author Georg Fischer
 */
public class A054765 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A054765() {
    super(0, "[[0],[-1,-2,-1],[-3,-2],[1]]", "[0,1,3,19]", 2);
  }
}
