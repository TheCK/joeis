package irvine.oeis.a156;
// Generated by gen_seq4.pl holos [[0],[10,-20],[1,1]] [1,5,50] 0 at 2020-03-14 22:45
// Recurrence: (n+1)*a[n+0]-10*(2*n-1)*a[n-1]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A156058 a(n) = 5^n * Catalan(n).
 * @author Georg Fischer
 */
public class A156058 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A156058() {
    super(0, "[[0],[10,-20],[1,1]]", "[1,5,50]", 0);
  }
}
