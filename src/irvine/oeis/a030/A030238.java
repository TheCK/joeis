package irvine.oeis.a030;
// Generated by gen_seq4.pl holos [[0],[2,-4],[1,1],[-2,4],[1,-5],[1,1]] [1,1,3,7,20] 0 at 2020-02-15 22:07
// Recurrence: (n+1)*a[n+0]+(-5*n+1)*a[n-1]+2*(2*n-1)*a[n-2]+(n+1)*a[n-3]+2*(-2*n+1)*a[n-4]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A030238 Backwards shallow diagonal sums of Catalan triangle A009766.
 * @author Georg Fischer
 */
public class A030238 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A030238() {
    super(0, "[[0],[2,-4],[1,1],[-2,4],[1,-5],[1,1]]", "[1,1,3,7,20]", 0);
  }
}
