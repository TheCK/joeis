package irvine.oeis.a143;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A143098 First differences of A143097.
 * @author Georg Fischer
 */
public class A143098 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A143098() {
    super(1, new long[] {0, 1, 2, -1, 1},
      new long[] {1, 0, 0, -1});
  }
}
