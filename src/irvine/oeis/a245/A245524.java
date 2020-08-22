package irvine.oeis.a245;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A245524 a(n) = n^2 - floor(n/2)*(-1)^n.
 * @author Georg Fischer
 */
public class A245524 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A245524() {
    super(1, new long[] {0, 1, 2, 5},
      new long[] {1, -1, -2, 2, 1, -1});
  }
}
