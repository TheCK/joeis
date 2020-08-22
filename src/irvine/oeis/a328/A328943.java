package irvine.oeis.a328;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: (5x^3+4x^2+3x+2)/(1-x^4)
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A328943 a(n) = 2 + (n mod 4).
 * @author Georg Fischer
 */
public class A328943 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A328943() {
    super(0, "[2,3,4,5]", "[1,0,0,0,-1]");
  }
}
