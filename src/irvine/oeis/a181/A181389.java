package irvine.oeis.a181;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: (-2*(-1+x+x^2-7*x^3+2*x^4))/(-1+x)^2
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A181389 Absolute difference between (sum of previous terms) and (n-th-even square) with a(1) = 2.
 * @author Georg Fischer
 */
public class A181389 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A181389() {
    super(1, "[0,2,-2,-2,14,-4]", "[1,-2,1]");
  }
}
