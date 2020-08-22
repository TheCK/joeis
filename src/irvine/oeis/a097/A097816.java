package irvine.oeis.a097;
// Generated by gen_seq4.pl holos [[0],[-25,25],[-5,-5],[1]] [1,10,125,2000] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]+5*(-n-1)*a[n-1]+25*(n-1)*a[n-2]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A097816 E.g.f. exp(5x)/(1-5x).
 * @author Georg Fischer
 */
public class A097816 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A097816() {
    super(0, "[[0],[-25,25],[-5,-5],[1]]", "[1,10,125,2000]", 0);
  }
}
