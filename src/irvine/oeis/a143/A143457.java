package irvine.oeis.a143;
// Generated by gen_seq4.pl lingf at 2021-08-18 17:31
// : 

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A143457 Expansion of 1/(x^k*(1-x-3*x^(k+1))) for k=6.
 * @author Georg Fischer
 */
public class A143457 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A143457() {
    super(0, "[1, 3, 3, 3, 3, 3, 3]", "[1,-1, 0, 0, 0, 0, 0,-3]");
  }
}
