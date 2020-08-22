package irvine.oeis.a322;
// Generated by gen_seq4.pl holos [[0],[11,11],[15,10],[-2,-1]] [1,5,43] 2 at 2020-02-15 22:07
// Recurrence: (11*n+11)*a[n+0]+(15+10*n)*a[n+1]+(-n-2)*a[n+2]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A322246 Expansion of g.f.: 1/sqrt(1 - 10*x - 11*x^2).
 * @author Georg Fischer
 */
public class A322246 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A322246() {
    super(0, "[[0],[11,11],[15,10],[-2,-1]]", "[1,5,43]", 2);
  }
}
