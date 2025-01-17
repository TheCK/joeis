package irvine.oeis.a038;
// Generated by gen_seq4.pl holos [[0,1,-1],[0,-1],[1]] [0,0,2] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=n*a[n-1]+n*(n-1)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A038154 a(n) = n! * Sum_{k=0..n-2} 1/k!.
 * @author Georg Fischer
 */
public class A038154 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A038154() {
    super(0, "[[0,1,-1],[0,-1],[1]]", "[0,0,2]", 0);
  }
}
