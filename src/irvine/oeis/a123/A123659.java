package irvine.oeis.a123;
// Generated by gen_seq4.pl holos [[-1,0,0,0,-1,0,-1,0,0,-1,-1,0,0,0,-1],[1]] [6] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=1+n^4+n^6+n^9+n^10+n^14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A123659 a(n) = 1 + n^4 + n^6 + n^9 + n^10 + n^14.
 * @author Georg Fischer
 */
public class A123659 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A123659() {
    super(1, "[[-1,0,0,0,-1,0,-1,0,0,-1,-1,0,0,0,-1],[1]]", "[6]", 0);
  }
}
