package irvine.oeis.a098;
// Generated by gen_seq4.pl holos [[0],[12,-8],[0,1]] [1,-4] 0 at 2020-02-15 22:07
// Recurrence: n*a[n+0]+4*(3-2*n)*a[n-1]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A098579 Expansion of sqrt(1-8*x).
 * @author Georg Fischer
 */
public class A098579 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A098579() {
    super(0, "[[0],[12,-8],[0,1]]", "[1,-4]", 0);
  }
}
