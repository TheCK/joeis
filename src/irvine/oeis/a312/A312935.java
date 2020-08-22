package irvine.oeis.a312;
// Generated by gen_seq4.pl holos [[0],[1],[-1],[0],[0],[0],[0],[0],[0],[0],[0],[0],[-1],[1]] [1,4,9,13,18,22,28,32,37,41,46,50,54] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=a[n-1]+a[n-11]-a[n-12]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A312935 Coordination sequence Gal.4.105.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A312935 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A312935() {
    super(0, "[[0],[1],[-1],[0],[0],[0],[0],[0],[0],[0],[0],[0],[-1],[1]]", "[1,4,9,13,18,22,28,32,37,41,46,50,54]", 0);
  }
}
