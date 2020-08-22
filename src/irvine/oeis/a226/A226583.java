package irvine.oeis.a226;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A226583 Smallest number of integer sided squares needed to tile a 10 X n rectangle.
 * @author Georg Fischer
 */
public class A226583 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A226583() {
    super(0, new long[] {0, 10, 5, -4, -1, -4, -10, -1, 5, 1},
      new long[] {1, 0, -1, 0, 0, -1, 0, 1});
  }
}
