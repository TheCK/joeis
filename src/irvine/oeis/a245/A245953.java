package irvine.oeis.a245;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A245953 Number of length 3+3 0..n arrays with some pair in every consecutive four terms totalling exactly n.
 * @author Georg Fischer
 */
public class A245953 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A245953() {
    super(1, new long[] {0, 48, 401, 669, 1241, -851, -557, 7, 3, -1},
      new long[] {1, -3, 0, 8, -6, -6, 8, 0, -3, 1});
  }
}
