package irvine.oeis.a332;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: x*(1-x-4*x^2-6*x^3-5*x^4)/(1-3*x-x^2)
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A332060 a(n) = 3*a(n-1) + a(n-2) after initial values a(0..5) = (0, 1, 2, 3, 5, 13).
 * @author Georg Fischer
 */
public class A332060 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A332060() {
    super(0, "[0,1,-1,-4,-6,-5]", "[1,-3,-1]");
  }
}
