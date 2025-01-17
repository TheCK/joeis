package irvine.oeis.a154;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A154637 a(n) is the ratio of the sum of squares of the bends of the circles that are added in the n-th generation of Apollonian packing, to the sum of squares of the bends of the initial three circles.
 * @author Georg Fischer
 */
public class A154637 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A154637() {
    super(0, new long[] {1, -18, 29},
      new long[] {1, -20, 3});
  }
}
