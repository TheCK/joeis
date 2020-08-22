package irvine.oeis.a315;
// Generated by gen_seq4.pl holos [[0],[1],[-1],[1],[-1],[1],[-1],[1],[-1],[-1],[1],[-1],[1],[-1],[1],[-1],[1]] [1,6,9,13,18,21,26,29,36,41,43,48,53,56,61,64,72] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=a[n-1]-a[n-2]+a[n-3]-a[n-4]+a[n-5]-a[n-6]+a[n-7]+a[n-8]-a[n-9]+a[n-10]-a[n-11]+a[n-12]-a[n-13]+a[n-14]-a[n-15]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A315964 Coordination sequence Gal.6.528.6 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A315964 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A315964() {
    super(0, "[[0],[1],[-1],[1],[-1],[1],[-1],[1],[-1],[-1],[1],[-1],[1],[-1],[1],[-1],[1]]", "[1,6,9,13,18,21,26,29,36,41,43,48,53,56,61,64,72]", 0);
  }
}
