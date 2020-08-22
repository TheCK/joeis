package irvine.oeis.a315;
// Generated by gen_seq4.pl holos [[0],[1],[-1],[0],[0],[0],[0],[0],[0],[0],[-1],[1]] [1,6,12,17,23,27,33,38,44,50,56] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=a[n-1]+a[n-9]-a[n-10]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A315696 Coordination sequence Gal.5.301.4 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A315696 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A315696() {
    super(0, "[[0],[1],[-1],[0],[0],[0],[0],[0],[0],[0],[-1],[1]]", "[1,6,12,17,23,27,33,38,44,50,56]", 0);
  }
}
