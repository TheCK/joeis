package irvine.oeis.a073;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A073351 n^2(n+1)(2n+1)^2(7n+1)/36.
 * @author Georg Fischer
 */
public class A073351 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A073351() {
    super(0, new long[] {0, 4, 97, 287, 159, 13},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
