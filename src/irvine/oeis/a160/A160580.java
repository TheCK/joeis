package irvine.oeis.a160;
// Generated by gen_seq4.pl holos [[0],[1],[0],[0],[-6],[0],[0],[1]] [325,457,877,1073,2285,4937,6113] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=6*a[n-3]-a[n-6]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A160580 Positive numbers y such that y^2 is of the form x^2+(x+457)^2 with integer x.
 * @author Georg Fischer
 */
public class A160580 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A160580() {
    super(1, "[[0],[1],[0],[0],[-6],[0],[0],[1]]", "[325,457,877,1073,2285,4937,6113]", 0);
  }
}
