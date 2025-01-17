package irvine.oeis.a143;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: (1+x+6x^2+16x^3+46x^4)/(1-x)^5
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A143132 Binomial transform of [1, 5, 15, 35, 70, 0, 0, 0, ...].
 * @author Georg Fischer
 */
public class A143132 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A143132() {
    super(1, "[0,1,1,6,16,46]", "[1,-5,10,-10,5,-1]");
  }
}
