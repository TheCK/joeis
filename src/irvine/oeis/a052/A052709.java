package irvine.oeis.a052;
// Generated by gen_seq4.pl holos [[0],[12,-4],[18,-8],[6,-3],[0,1]] [0,1,1,3] 0 at 2020-02-15 22:07
// Recurrence: n*a[n+0]=(3*n-6)*a[n-1]+(8*n-18)*a[n-2]+(4*n-12)*a[n-3]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A052709 Expansion of (1-sqrt(1-4x-4x^2))/(2(1+x)).
 * @author Georg Fischer
 */
public class A052709 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A052709() {
    super(0, "[[0],[12,-4],[18,-8],[6,-3],[0,1]]", "[0,1,1,3]", 0);
  }
}
