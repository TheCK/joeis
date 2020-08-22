package irvine.oeis.a097;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A097297 Seventh column (m=6) of (1,6)-Pascal triangle A096956.
 * @author Georg Fischer
 */
public class A097297 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A097297() {
    super(0, new long[] {6, -5},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
