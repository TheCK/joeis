package irvine.oeis.a089;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: (1-x^8)*(1-x^9)/((1-x^3)*(1-x^4))
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A089012 a(n) = 1 if n is an exponent of the Weyl group W(E_6), 0 otherwise.
 * @author Georg Fischer
 */
public class A089012 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A089012() {
    super(1, "[0,1,0,0,0,0,0,0,0,-1,-1,0,0,0,0,0,0,0,1]", "[1,0,0,-1,-1,0,0,1]");
  }
}
