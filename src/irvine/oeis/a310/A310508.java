package irvine.oeis.a310;
// Generated by gen_seq4.pl holos [[0],[1],[0],[0],[0],[0],[-2],[0],[0],[0],[0],[1]] [1,4,10,16,21,24,29,36,42,46,48] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=2*a[n-5]-a[n-10]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A310508 Coordination sequence Gal.4.123.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310508 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A310508() {
    super(0, "[[0],[1],[0],[0],[0],[0],[-2],[0],[0],[0],[0],[1]]", "[1,4,10,16,21,24,29,36,42,46,48]", 0);
  }
}
