package irvine.oeis.a315;
// Generated by gen_seq4.pl holos [[0],[1],[-2],[1],[0],[1],[-2],[1]] [1,6,12,17,22,27,32] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=2*a[n-1]-a[n-2]-a[n-4]+2*a[n-5]-a[n-6]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A315685 Coordination sequence Gal.4.140.4 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A315685 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A315685() {
    super(0, "[[0],[1],[-2],[1],[0],[1],[-2],[1]]", "[1,6,12,17,22,27,32]", 0);
  }
}
