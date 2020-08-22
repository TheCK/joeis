package irvine.oeis.a180;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A180846 a(n) = (81^n - 2^n)/79.
 * @author Georg Fischer
 */
public class A180846 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A180846() {
    super(0, new long[] {0, 1},
      new long[] {1, -83, 162});
  }
}
