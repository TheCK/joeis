package irvine.oeis.a329;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: (1+x)^2*(1+2*x^2-x^3)/(1-x)
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A329513 G.f. = (1+x)^2*(1+2*x^2-x^3)/(1-x).
 * @author Georg Fischer
 */
public class A329513 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A329513() {
    super(0, "[1,2,3,3,0,-1]", "[1,-1]");
  }
}
