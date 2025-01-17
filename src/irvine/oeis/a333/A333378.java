package irvine.oeis.a333;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: (x^3-x^2+x)/(x^4+3*x^2+1)
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A333378 a(n) = F(n) * (-1)^(n*(n-1)/2) where F(n) = A000045(n) Fibonacci numbers.
 * @author Georg Fischer
 */
public class A333378 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A333378() {
    super(0, "[0,1,-1,1]", "[1,0,3,0,1]");
  }
}
