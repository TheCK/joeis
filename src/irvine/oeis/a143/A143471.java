package irvine.oeis.a143;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A143471 Expansion of 1/(x^10*p(x + 1/x)), where p(x) = 1 - x^3 - x^5 - x^7 + x^10 is a Salem polynomial.
 * @author Georg Fischer
 */
public class A143471 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A143471() {
    super(0, new long[] {1},
      new long[] {1, 0, 10, -1, 45, -8, 120, -27, 210, -48, 253, -48, 210, -27, 
      120, -8, 45, -1, 10, 0, 1});
  }
}
