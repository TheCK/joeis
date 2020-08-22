package irvine.oeis.a096;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A096959 Sixth column (m=5) of (1,6)-Pascal triangle A096956.
 * @author Georg Fischer
 */
public class A096959 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A096959() {
    super(0, new long[] {6, -5},
      new long[] {1, -6, 15, -20, 15, -6, 1});
  }
}
