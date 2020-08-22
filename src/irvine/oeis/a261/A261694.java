package irvine.oeis.a261;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: x*(1+x+2*x^2+3*x^3+5*x^4+8*x^5+13*x^6+13*x^8+13*x^9+5*x^10+18*x^11+2*x^12+20*x^13+x^14)/(1-x^16)
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A261694 a(n) = Fibonacci(n) mod 21.
 * @author Georg Fischer
 */
public class A261694 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A261694() {
    super(0, "[0,1,1,2,3,5,8,13,0,13,13,5,18,2,20,1]", "[1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-1]");
  }
}
