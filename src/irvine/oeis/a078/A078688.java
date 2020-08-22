package irvine.oeis.a078;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A078688 Continued fraction expansion of e^(1/4).
 * @author Georg Fischer
 */
public class A078688 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A078688() {
    super(0, new long[] {1, 2, -2, -2, 6, -6, 1},
      new long[] {1, -1, 0, -2, 2, 0, 1, -1});
  }
}
