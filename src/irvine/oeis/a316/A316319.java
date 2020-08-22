package irvine.oeis.a316;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: (1+x+x^2)*(1+x^2+2*x^3+x^4-x^5)/(1-x)^2
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A316319 Coordination sequence for a trivalent node in a chamfered version of the 3^6 triangular tiling of the plane.
 * @author Georg Fischer
 */
public class A316319 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A316319() {
    super(0, "[1,1,2,3,4,2,0,-1]", "[1,-2,1]");
  }
}
