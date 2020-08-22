package irvine.oeis.a204;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A204708 Number of (n+1) X 4 0..1 arrays with the permanents of all 2 X 2 subblocks equal and nonzero.
 * @author Georg Fischer
 */
public class A204708 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A204708() {
    super(1, new long[] {0, 25, 6, -36},
      new long[] {1, -3, -2, 4});
  }
}
