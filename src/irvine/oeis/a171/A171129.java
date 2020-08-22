package irvine.oeis.a171;
// Generated by gen_seq4.pl holos [[0,1,1,1,-1],[2]] [0,-1] 0 at 2020-03-14 22:45
// Recurrence: 2*a[n+0]=(n^4-n^3-n^2-n)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A171129 a(n)=(n^4-n^3-n^2-n)/2.
 * @author Georg Fischer
 */
public class A171129 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A171129() {
    super(0, "[[0,1,1,1,-1],[2]]", "[0,-1]", 0);
  }
}
