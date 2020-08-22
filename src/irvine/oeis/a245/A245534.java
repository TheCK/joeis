package irvine.oeis.a245;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A245534 a(n) = n^2 + floor(n/2)*(-1)^n.
 * @author Georg Fischer
 */
public class A245534 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A245534() {
    super(1, new long[] {0, 1, 4, 1, 2},
      new long[] {1, -1, -2, 2, 1, -1});
  }
}
