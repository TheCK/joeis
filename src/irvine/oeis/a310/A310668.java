package irvine.oeis.a310;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: (-3*x^12+x^10+7*x^9+10*x^8+13*x^7+15*x^6+17*x^5+14*x^4+12*x^3+7*x^2+4*x+1)/(x^10+x^8-x^7-2*x^5-x^3+x^2+1)
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A310668 Coordination sequence Gal.4.30.2 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310668 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A310668() {
    super(0, "[1,4,7,12,14,17,15,13,10,7,1,0,-3]", "[1,0,1,-1,0,-2,0,-1,1,0,1]");
  }
}
