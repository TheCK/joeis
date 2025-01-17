package irvine.oeis.a315;
// Generated by gen_seq4.pl holos [[0],[1],[-1],[0],[0],[0],[-1],[1]] [1,6,12,17,23,29,35] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=a[n-1]+a[n-5]-a[n-6]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A315707 Coordination sequence Gal.5.295.3 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A315707 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A315707() {
    super(0, "[[0],[1],[-1],[0],[0],[0],[-1],[1]]", "[1,6,12,17,23,29,35]", 0);
  }
}
