package irvine.oeis.a106;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A106232 Least k &gt; 0 such that (4*n^2 + 2)*(k^2) + (4*n^2 + 2)*k + 1 = j^2.
 * @author Georg Fischer
 */
public class A106232 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A106232() {
    super(1, new long[] {0, -4, 8, -12, 4},
      new long[] {-1, 3, -3, 1});
  }
}
