package irvine.oeis.a134;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: x/((-1+x+x^6)^4*(-1+2*x+x^6)*(-1+46*x+21*x^6))
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A134552 G.f.: 1/(x^36*p(1/x)), where p(x)=(-1 - x^5 + x^6)^4*(-1 - 2*x^5 + x^6)*(-21 - 46 x^5 + x^6).
 * @author Georg Fischer
 */
public class A134552 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A134552() {
    super(1, "[0,1]", "[1,-52,290,-660,745,-416,66,380,-1440,2300,-1670,456,115,-1000,2580,-2620,925,0,-220,1240,-2000,980,0,0,215,-740,570,0,0,0,-106,172,0,0,0,0,21]");
  }
}
