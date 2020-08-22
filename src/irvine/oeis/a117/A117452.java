package irvine.oeis.a117;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A117452 Periodic {2, -1, 1, 0, 0} - 0^n.
 * @author Georg Fischer
 */
public class A117452 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A117452() {
    super(0, new long[] {1, -1, 1, 0, 0, 1},
      new long[] {1, 0, 0, 0, 0, -1});
  }
}
