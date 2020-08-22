package irvine.oeis.a108;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A108676 a(n) = (n+1)^2*(n+2)*(5*n^2 + 15*n + 12)/24.
 * @author Georg Fischer
 */
public class A108676 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A108676() {
    super(0, new long[] {1, 10, 12, 2},
      new long[] {1, -6, 15, -20, 15, -6, 1});
  }
}
