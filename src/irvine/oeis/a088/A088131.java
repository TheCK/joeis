package irvine.oeis.a088;
// Generated by gen_seq4.pl holos [[0],[1],[0],[-4],[1]] [1,1,8,29] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=4*a[n-1]-a[n-3]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A088131 a(n) equals the square of the n-th partial sum added to twice the n-th partial sum of the squares, divided by a(n-1), for all n&gt;=1, with a(0)=1, a(1)=1.
 * @author Georg Fischer
 */
public class A088131 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A088131() {
    super(0, "[[0],[1],[0],[-4],[1]]", "[1,1,8,29]", 0);
  }
}
