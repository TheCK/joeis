package irvine.oeis.a251;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A251276 Number of (n+1) X (1+1) 0..3 arrays with no 2 X 2 subblock having its maximum diagonal element less than its minimum antidiagonal element.
 * @author Georg Fischer
 */
public class A251276 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A251276() {
    super(1, new long[] {0, 230, -416},
      new long[] {1, -16, 26});
  }
}
