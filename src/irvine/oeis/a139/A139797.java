package irvine.oeis.a139;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: -x^4/((2*x-1)*(x^2-x+1)*(x+1)^2)
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A139797 Inverse binomial transform of [0, A133474].
 * @author Georg Fischer
 */
public class A139797 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A139797() {
    super(0, "[0,0,0,0,1]", "[1,-1,-2,1,-1,-2]");
  }
}
