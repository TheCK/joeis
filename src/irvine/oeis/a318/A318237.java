package irvine.oeis.a318;
// Generated by gen_seq4.pl holos [[0],[6,11,6,1],[0],[0],[0],[1],[1]] [1,0,0,0,0,-6] 5 at 2020-03-14 22:45
// Recurrence: (n+3)*(n+2)*(n+1)*a[n+0]+a[n+4]+a[n+5]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A318237 E.g.f. satisfies y'' + y' + x^3*y = 0 with y(0)=1, y'(0)=0.
 * @author Georg Fischer
 */
public class A318237 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A318237() {
    super(0, "[[0],[6,11,6,1],[0],[0],[0],[1],[1]]", "[1,0,0,0,0,-6]", 5);
  }
}
