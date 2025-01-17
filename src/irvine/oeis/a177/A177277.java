package irvine.oeis.a177;
// Generated by gen_seq4.pl holos [[-247,27,-1],[-1],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[1]] [0,0,0,0,1,2,3,5,7,10,14,18,23,29,36,44,53,63,75,88,102,118,135,154,175,197,221,247,275] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=a[n-28]+(n+1)*(n-28)+275
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A177277 Partial sums of round(n^2/28).
 * @author Georg Fischer
 */
public class A177277 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A177277() {
    super(0, "[[-247,27,-1],[-1],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[1]]", "[0,0,0,0,1,2,3,5,7,10,14,18,23,29,36,44,53,63,75,88,102,118,135,154,175,197,221,247,275]", 0);
  }
}
