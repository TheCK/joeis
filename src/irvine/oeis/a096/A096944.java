package irvine.oeis.a096;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A096944 Seventh column of (1,5)-Pascal triangle A096940.
 * @author Georg Fischer
 */
public class A096944 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A096944() {
    super(0, new long[] {5, -4},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
