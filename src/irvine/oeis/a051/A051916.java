package irvine.oeis.a051;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: (3x^7+2x^6+2x^5+2x^4+6x^3+5x^2+4x+3)/(1-2x^4)
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A051916 The Greek sequence: 2^a * 3^b * 5^c where a = 0,1,2,3..., b,c in {0,1}, excluding the terms 1,2; that is: (a,b,c) =/= (0,0,0), (1,0,0)):.
 * @author Georg Fischer
 */
public class A051916 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A051916() {
    super(1, "[0,3,4,5,6,2,2,2,3]", "[1,0,0,0,-2]");
  }
}
