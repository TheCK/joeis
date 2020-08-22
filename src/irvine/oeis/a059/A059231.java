package irvine.oeis.a059;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (1+3*x-sqrt(1-10*x+9*x^2))/(8*x)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A059231 Number of different lattice paths running from (0,0) to (n,0) using steps from S = {(k,k) or (k,-k): k positive integer} that never go below the x-axis.
 * @author Georg Fischer
 */
public class A059231 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A059231() {
    super(0, "[[0],[0,27,27],[-72,-111,-39],[84,67,13],[-12,-7,-1]]", "[1,1,5,29,185]", 3);
  }
}
