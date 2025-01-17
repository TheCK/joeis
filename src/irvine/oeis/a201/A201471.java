package irvine.oeis.a201;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: x^3*(3-2*x+x^2-x^3+x^4+2*x^6-2*x^7)/(1-x)^2
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A201471 Maximal diameter of a connected n-gamma_t-vertex-critical graph.
 * @author Georg Fischer
 */
public class A201471 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A201471() {
    super(3, "[0,0,0,3,-2,1,-1,1,0,2,-2]", "[1,-2,1]");
  }
}
