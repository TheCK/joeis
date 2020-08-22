package irvine.oeis.a143;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A143611 Expansion of x/((1-x)^2(1+x-x^3-x^4-x^5-x^6-x^7+x^9+x^10)).
 * @author Georg Fischer
 */
public class A143611 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A143611() {
    super(1, new long[] {0, 1},
      new long[] {1, -1, -1, 0, 1, 0, 0, 0, 1, 0, -1, -1, 1});
  }
}
