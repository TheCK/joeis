package irvine.oeis.a306;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A306368 a(n) = numerator of (n + 3)*(n + 4)/((n + 1)*(n + 2)).
 * @author Georg Fischer
 */
public class A306368 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A306368() {
    super(0, new long[] {6, 10, 5, 3, -2, -3, 0, 1, 1},
      new long[] {1, 0, 0, -3, 0, 0, 3, 0, 0, -1});
  }
}
