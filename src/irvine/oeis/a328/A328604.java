package irvine.oeis.a328;
// Generated by gen_seq4.pl holos [[0],[-9],[-2],[1]] [1,9,27,135] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=2*a[n-1]+9*a[n-2]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A328604 G.f.: (1 + 7*x) / (1 - 2*x - 9*x^2).
 * @author Georg Fischer
 */
public class A328604 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A328604() {
    super(0, "[[0],[-9],[-2],[1]]", "[1,9,27,135]", 0);
  }
}
