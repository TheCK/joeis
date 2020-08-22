package irvine.oeis.a294;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A294804 Number of permutations of [n] avoiding {1324,3142,4231}.
 * @author Georg Fischer
 */
public class A294804 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A294804() {
    super(0, new long[] {1, -8, 25, -36, 23, -4, 1},
      new long[] {1, -9, 32, -56, 48, -16});
  }
}
