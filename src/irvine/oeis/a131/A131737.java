package irvine.oeis.a131;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A131737 Essentially even numbers followed by duplicated odd numbers.
 * @author Georg Fischer
 */
public class A131737 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A131737() {
    super(0, new long[] {0, 1, 0, 0, 0, 1},
      new long[] {1, -1, 0, -1, 1});
  }
}
