package irvine.oeis.a294;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A294806 Number of permutations of [n] avoiding {1324, 3421, 3241}.
 * @author Georg Fischer
 */
public class A294806 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A294806() {
    super(0, new long[] {1, -11, 52, -136, 214, -204, 111, -28},
      new long[] {1, -12, 62, -180, 321, -360, 248, -96, 16});
  }
}
