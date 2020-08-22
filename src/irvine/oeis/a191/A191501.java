package irvine.oeis.a191;
// Generated by gen_seq4.pl holos [[0],[18,-4],[12,-4],[6,-4],[0,1]] [1,2,4,10] 0 at 2020-02-15 22:07
// Recurrence: n*a[n+0]+2*(-2*n+3)*a[n-1]+4*(-n+3)*a[n-2]+2*(-2*n+9)*a[n-3]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A191501 Expansion of 2-sqrt(1-4*x-4*x^2-4*x^3).
 * @author Georg Fischer
 */
public class A191501 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A191501() {
    super(0, "[[0],[18,-4],[12,-4],[6,-4],[0,1]]", "[1,2,4,10]", 0);
  }
}
