package irvine.oeis.a060;
// Generated by gen_seq4.pl holos [[0],[-4,16,-16],[0,0,1]] [1,1,9] 0 at 2020-03-14 22:45
// Recurrence: n^2*a[n+0]-4*(2*n-1)^2*a[n-1]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A060150 a(0) = 1; for n &gt; 0, binomial(2n-1, n-1)^2.
 * @author Georg Fischer
 */
public class A060150 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A060150() {
    super(0, "[[0],[-4,16,-16],[0,0,1]]", "[1,1,9]", 0);
  }
}
