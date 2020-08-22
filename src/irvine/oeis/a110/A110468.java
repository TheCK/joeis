package irvine.oeis.a110;
// Generated by gen_seq4.pl holos [[0],[0,0,-2,-4],[1,1]] [1,3,40] 0 at 2020-03-14 22:45
// Recurrence: (n+1)*a[n+0]+2*(-n^2)*(2*n+1)*a[n-1]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A110468 a(n) = (2*n + 1)!/(n + 1).
 * @author Georg Fischer
 */
public class A110468 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A110468() {
    super(0, "[[0],[0,0,-2,-4],[1,1]]", "[1,3,40]", 0);
  }
}
