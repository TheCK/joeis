package irvine.oeis.a087;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A087539 First differences of A011849.
 * @author Georg Fischer
 */
public class A087539 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A087539() {
    super(1, new long[] {0, 0, 0, 1, -1, 0, 2, -2, 1},
      new long[] {1, -3, 3, 0, -3, 3, 0, -3, 3, -1});
  }
}
