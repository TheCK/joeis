package irvine.oeis.a218;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A218009 Binomial transform of A212831(n).
 * @author Georg Fischer
 */
public class A218009 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A218009() {
    super(0, new long[] {0, 1, -2, 2, -2, 2},
      new long[] {1, -6, 14, -16, 8});
  }
}
