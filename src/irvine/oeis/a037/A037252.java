package irvine.oeis.a037;
// Generated by gen_seq4.pl holos [[0,0,0,0,0,0,0,0,0,0,0,0,-1,1,0,-1,2,-1,-1,2,-1,-1,2,-1,0,1,-1],[1]] [0,0] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=n^12*(n^6+1)*(n^4-1)*(n^3+1)*(n-1)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A037252 a(n) = n^12*(n^6 + 1)*(n^4 - 1)*(n^3 + 1)*(n-1).
 * @author Georg Fischer
 */
public class A037252 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A037252() {
    super(0, "[[0,0,0,0,0,0,0,0,0,0,0,0,-1,1,0,-1,2,-1,-1,2,-1,-1,2,-1,0,1,-1],[1]]", "[0,0]", 0);
  }
}
