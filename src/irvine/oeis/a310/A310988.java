package irvine.oeis.a310;
// Generated by gen_seq4.pl holos [[0],[1],[0],[0],[0],[0],[0],[0],[-2],[0],[0],[0],[0],[0],[0],[1]] [1,4,8,10,14,16,23,24,31,32,34,38,40,50,48] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=2*a[n-7]-a[n-14]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A310988 Coordination sequence Gal.4.16.3 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310988 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A310988() {
    super(0, "[[0],[1],[0],[0],[0],[0],[0],[0],[-2],[0],[0],[0],[0],[0],[0],[1]]", "[1,4,8,10,14,16,23,24,31,32,34,38,40,50,48]", 0);
  }
}
