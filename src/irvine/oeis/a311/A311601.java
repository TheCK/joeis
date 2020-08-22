package irvine.oeis.a311;
// Generated by gen_seq4.pl holos [[0],[1],[-2],[2],[-2],[2],[-2],[2],[-2],[2],[-2],[1]] [1,4,8,12,18,22,26,32,36,40,44,48] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=2*a[n-1]-2*a[n-2]+2*a[n-3]-2*a[n-4]+2*a[n-5]-2*a[n-6]+2*a[n-7]-2*a[n-8]+2*a[n-9]-a[n-10]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A311601 Coordination sequence Gal.6.230.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A311601 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A311601() {
    super(0, "[[0],[1],[-2],[2],[-2],[2],[-2],[2],[-2],[2],[-2],[1]]", "[1,4,8,12,18,22,26,32,36,40,44,48]", 0);
  }
}
