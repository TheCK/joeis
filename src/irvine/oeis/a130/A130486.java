package irvine.oeis.a130;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: x*(1-8*x^7+7*x^8)/((1-x^8)*(1-x)^3)
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A130486 a(n) = Sum_{k=0..n} (k mod 8) (Partial sums of A010877).
 * @author Georg Fischer
 */
public class A130486 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A130486() {
    super(0, "[0,1,0,0,0,0,0,0,-8,7]", "[1,-3,3,-1,0,0,0,0,-1,3,-3,1]");
  }
}
