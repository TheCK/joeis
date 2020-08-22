package irvine.oeis.a061;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: (22+35*x+18*x^2-72*x^4-90*x^5-48*x^6-60*x^7+80*x^8+112*x^9)/((1-x)*(1+x)*(1-2*x^2)*(1-2*x^4))
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A061561 Trajectory of 22 under the Reverse and Add! operation carried out in base 2.
 * @author Georg Fischer
 */
public class A061561 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A061561() {
    super(0, "[22,35,18,0,-72,-90,-48,-60,80,112]", "[1,0,-3,0,0,0,6,0,-4]");
  }
}
