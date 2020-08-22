package irvine.oeis.a301;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: (x^10+4*x^9+6*x^7+x^6+3*x^5+x^4+6*x^3+4*x+1)/((x^4+x^3+x^2+x+1)*(x^4-x^3+x^2-x+1)*(x-1)^2)
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A301724 Coordination sequence for node of type V1 in "kra" 2-D tiling (or net).
 * @author Georg Fischer
 */
public class A301724 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A301724() {
    super(0, "[1,4,0,6,1,3,1,6,0,4,1]", "[1,-2,2,-2,2,-2,2,-2,2,-2,1]");
  }
}
