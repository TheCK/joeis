package irvine.oeis.a187;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (1-x-sqrt(1-2*x-3*x^2))/(2*x^2*(1+x))
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A187306 Alternating sum of Motzkin numbers A001006.
 * @author Georg Fischer
 */
public class A187306 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A187306() {
    super(0, "[[0],[6,3],[13,5],[2,1],[-5,-1]]", "[1,0,2,2,7]", 3);
  }
}
