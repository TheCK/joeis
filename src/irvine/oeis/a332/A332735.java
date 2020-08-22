package irvine.oeis.a332;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: x^9*(1+4*x+3*x^2+6*x^3+3*x^4+4*x^5+4*x^7-3*x^8+3*x^9-x^10+x^11)/((1-x)^4*(1+x)^2*(1+x^2))
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A332735 Numbers of graphs which are double triangle descendants of K_5 with four more vertices than triangles.
 * @author Georg Fischer
 */
public class A332735 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A332735() {
    super(9, "[0,0,0,0,0,0,0,0,0,1,4,3,6,3,4,0,4,-3,3,-1,1]", "[1,-2,0,2,-2,2,0,-2,1]");
  }
}
