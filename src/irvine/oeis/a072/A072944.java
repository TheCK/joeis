package irvine.oeis.a072;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: (1+x)/2+(3+5*x+8*x^2)/(2*(1-4*x^3))
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A072944 a(1)=2, a(n+1) = 2*a(n) - phi(a(n)) where phi is the Euler totient function A000010.
 * @author Georg Fischer
 */
public class A072944 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A072944() {
    super(1, "[0,2,3,4,-2,-2]", "[1,0,0,-4]");
  }
}
