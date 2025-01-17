package irvine.oeis.a059;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: -(-2+(-3*x^2-6*x+1)^(1/2))/(1+x)^2
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A059284 Right edge of triangle in A059283.
 * @author Georg Fischer
 */
public class A059284 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A059284() {
    super(0, "[[0],[3,3],[15,9],[5,5],[-3,-1]]", "[1,1,3,11,47]", 3);
  }
}
