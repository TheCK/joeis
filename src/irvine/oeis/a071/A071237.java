package irvine.oeis.a071;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A071237 a(n) = n*(n+1)*(n^2+1)/2.
 * @author Georg Fischer
 */
public class A071237 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A071237() {
    super(0, new long[] {0, 2, 5, 5},
      new long[] {1, -5, 10, -10, 5, -1});
  }
}
