package irvine.oeis.a064;
// Generated by gen_seq4.pl holos [[0,0,0,0,0,0,-1,1,-1,2,-2,2,-1,1,-1],[1]] [0,0] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=n^6*(n^4+n^2+1)*(n^3-1)*(n-1)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A064587 a(n) = n^6*(n^4 + n^2 + 1)*(n^3 - 1)*(n - 1).
 * @author Georg Fischer
 */
public class A064587 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A064587() {
    super(0, "[[0,0,0,0,0,0,-1,1,-1,2,-2,2,-1,1,-1],[1]]", "[0,0]", 0);
  }
}
