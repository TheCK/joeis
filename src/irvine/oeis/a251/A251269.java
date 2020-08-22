package irvine.oeis.a251;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A251269 Number of (2+1) X (n+1) 0..1 arrays with no 2 X 2 subblock having x11-x00 less than x10-x01.
 * @author Georg Fischer
 */
public class A251269 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A251269() {
    super(1, new long[] {0, 35, -96, 119, -70, 16},
      new long[] {1, -6, 14, -16, 9, -2});
  }
}
