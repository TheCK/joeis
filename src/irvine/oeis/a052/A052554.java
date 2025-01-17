package irvine.oeis.a052;
// Generated by gen_seq4.pl holos [[0],[0,1,-1],[0,-1],[1]] [1,0,2,6] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=n*a[n-1]+n*(n-1)*a[n-2]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A052554 Expansion of e.g.f.: (1-x)/(1 - x - x^2).
 * @author Georg Fischer
 */
public class A052554 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A052554() {
    super(0, "[[0],[0,1,-1],[0,-1],[1]]", "[1,0,2,6]", 0);
  }
}
