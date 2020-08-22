package irvine.oeis.a263;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: (1+x^3)/(1+x)
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A263013 a(0) = -a(1) = a(2) = 1, a(n) = 0 for n&gt;2.
 * @author Georg Fischer
 */
public class A263013 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A263013() {
    super(0, "[1,0,0,1]", "[1,1]");
  }
}
