package irvine.oeis.a276;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: (2+25*x)/(1-11*x+10*x^2)
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A276509 Numbers n in base 10 such that the digits of 2 + n are the digits of 2n written in reverse order.
 * @author Georg Fischer
 */
public class A276509 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A276509() {
    super(1, "[0,2,25]", "[1,-11,10]");
  }
}
