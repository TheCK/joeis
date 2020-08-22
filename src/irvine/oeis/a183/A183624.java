package irvine.oeis.a183;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A183624 Number of (n+1) X 2 0..2 arrays with every 2 x 2 subblock summing to 4.
 * @author Georg Fischer
 */
public class A183624 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A183624() {
    super(1, new long[] {0, 19, -69, 54},
      new long[] {1, -6, 11, -6});
  }
}
