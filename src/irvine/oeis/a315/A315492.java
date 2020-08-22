package irvine.oeis.a315;
// Generated by gen_seq4.pl holos [[0],[1],[-1],[0],[0],[0],[0],[0],[0],[0],[0],[0],[-1],[1]] [1,6,11,16,22,28,32,38,44,49,54,60,66] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=a[n-1]+a[n-11]-a[n-12]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A315492 Coordination sequence Gal.6.625.2 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A315492 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A315492() {
    super(0, "[[0],[1],[-1],[0],[0],[0],[0],[0],[0],[0],[0],[0],[-1],[1]]", "[1,6,11,16,22,28,32,38,44,49,54,60,66]", 0);
  }
}
