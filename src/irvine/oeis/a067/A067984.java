package irvine.oeis.a067;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A067984 Convolution of L(n+1) := A000204(n+1) (Lucas), n&gt;=0, with L(n+6), n&gt;=0.
 * @author Georg Fischer
 */
public class A067984 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A067984() {
    super(0, new long[] {18, 47, 22},
      new long[] {1, -2, -1, 2, 1});
  }
}
