package irvine.oeis.a143;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A143100 A007318 * A143098.
 * @author Georg Fischer
 */
public class A143100 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A143100() {
    super(1, new long[] {0, 1, -1, -2, 3},
      new long[] {1, -4, 6, -5, 2});
  }
}
