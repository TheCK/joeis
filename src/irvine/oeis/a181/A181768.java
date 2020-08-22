package irvine.oeis.a181;
// Generated by gen_seq4.pl holos [[0],[-10,5],[8,-6],[0,1]] [1,1,2] 0 at 2020-02-15 22:07
// Recurrence: n*a[n+0]+2*(-3*n+4)*a[n-1]+5*(n-2)*a[n-2]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A181768 G.f.: (1/2)*(3 - sqrt((1-5*x)/(1-x))).
 * @author Georg Fischer
 */
public class A181768 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A181768() {
    super(0, "[[0],[-10,5],[8,-6],[0,1]]", "[1,1,2]", 0);
  }
}
