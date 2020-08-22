package irvine.oeis.a211;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A211715 Number of (n+1) X (n+1) -11..11 symmetric matrices with every 2 X 2 subblock having sum zero and two or four distinct values.
 * @author Georg Fischer
 */
public class A211715 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A211715() {
    super(1, new long[] {0, 34, -44},
      new long[] {1, -3, 2});
  }
}
