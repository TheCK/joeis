package irvine.oeis.a067;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A067981 Convolution of L(n+1) := A000204(n+1) (Lucas), n&gt;=0, with L(n+3), n&gt;=0.
 * @author Georg Fischer
 */
public class A067981 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A067981() {
    super(0, new long[] {4, 11, 6},
      new long[] {1, -2, -1, 2, 1});
  }
}
