package irvine.oeis.a228;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A228223 Number of second differences of arrays of length 8 of numbers in 0..n.
 * @author Georg Fischer
 */
public class A228223 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A228223() {
    super(1, new long[] {0, 255, 4520, 20195, 31136, 8989, -4616, 1},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
