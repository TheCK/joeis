package irvine.oeis.a181;
// Generated by gen_seq4.pl holos at 2021-05-10 22:28
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A181203 a(n)=0!*1!*2!*3!*4!*(5*n)!*10*n*(n-1) / ((n)!*(n+1)!*(n+2)!*(n+3)!*(n+4)!).
 * @author Georg Fischer
 */
public class A181203 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A181203() {
    super(1, "[[0],[0,-120, 1250,-4375, 6250,-3125],[-48,-76,-20, 15, 8, 1]]", "[0, 840, 360360]", 0);
  }
}
