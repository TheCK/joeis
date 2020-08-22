package irvine.oeis.a310;
// Generated by gen_seq4.pl holos [[0],[1],[0],[0],[-1],[0],[0],[-1],[0],[0],[1]] [1,3,7,10,13,19,20,23,29,30] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=a[n-3]+a[n-6]-a[n-9]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A310185 Coordination sequence Gal.4.15.2 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310185 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A310185() {
    super(0, "[[0],[1],[0],[0],[-1],[0],[0],[-1],[0],[0],[1]]", "[1,3,7,10,13,19,20,23,29,30]", 0);
  }
}
