package irvine.oeis.a067;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: x*(11-2*x-12*x^2+8*x^3+26*x^4-12*x^5-12*x^6+8*x^7+3*x^8-2*x^9)/((1+x)^4*(x-1)^6)
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A067969 Number of nodes in virtual, "optimal", chordal graphs of diameter 5, degree =n+1.
 * @author Georg Fischer
 */
public class A067969 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A067969() {
    super(1, "[0,11,-2,-12,8,26,-12,-12,8,3,-2]", "[1,-2,-3,8,2,-12,2,8,-3,-2,1]");
  }
}
