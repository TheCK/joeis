package irvine.oeis.a181;
// Generated by gen_seq4.pl holos at 2021-05-10 22:28
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A181201 a(n)=0!*1!*2!*(3*n)!*3*n*(n-1) / ((n)!*(n+1)!*(n+2)!).
 * @author Georg Fischer
 */
public class A181201 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A181201() {
    super(1, "[[0],[0,-6, 27,-27],[-4,-4, 1, 1]]", "[0, 30, 756]", 0);
  }
}
