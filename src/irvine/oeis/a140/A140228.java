package irvine.oeis.a140;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A140228 Binomial transform of [1, 5, 10, 10, 5, 1, 1, -1, 1, -1, 1, ...].
 * @author Georg Fischer
 */
public class A140228 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A140228() {
    super(0, new long[] {1, 0, 0, 0, 0, 0, 1},
      new long[] {1, -6, 15, -20, 15, -6, 1});
  }
}
