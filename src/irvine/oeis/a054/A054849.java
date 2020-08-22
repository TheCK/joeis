package irvine.oeis.a054;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: 1/(1-2*x)^6
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A054849 a(n) = 2^(n-5)*binomial(n,5). Number of 5D hypercubes in an n-dimensional hypercube.
 * @author Georg Fischer
 */
public class A054849 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A054849() {
    super(5, "[0,0,0,0,0,1]", "[1,-12,60,-160,240,-192,64]");
  }
}
