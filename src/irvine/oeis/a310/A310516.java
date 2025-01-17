package irvine.oeis.a310;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: (-2*x^11+3*x^10+4*x^9+9*x^8+14*x^7+10*x^6+8*x^5+12*x^4+12*x^3+9*x^2+4*x+1)/(x^10-x^8-x^2+1)
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A310516 Coordination sequence Gal.6.599.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310516 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A310516() {
    super(0, "[1,4,9,12,12,8,10,14,9,4,3,-2]", "[1,0,-1,0,0,0,0,0,-1,0,1]");
  }
}
