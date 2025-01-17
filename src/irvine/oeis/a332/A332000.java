package irvine.oeis.a332;
// Generated by gen_seq4.pl holos [[-4418],[1],[0],[0],[0],[0],[-6],[0],[0],[0],[0],[1]] [0,752,1820,2231,3995,6627,10575,16511,18840,28952,44180] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=6*a[n-5]-a[n-10]+4418
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A332000 Nonnegative values x of solutions (x, y) to the Diophantine equation x^2 + (x + 47^2)^2 = y^2.
 * @author Georg Fischer
 */
public class A332000 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A332000() {
    super(1, "[[-4418],[1],[0],[0],[0],[0],[-6],[0],[0],[0],[0],[1]]", "[0,752,1820,2231,3995,6627,10575,16511,18840,28952,44180]", 0);
  }
}
