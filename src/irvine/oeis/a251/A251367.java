package irvine.oeis.a251;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A251367 Number of (n+1) X (2+1) 0..2 arrays with every 2 X 2 subblock summing to 1, 2, 3, 4, 5, 6, or 7.
 * @author Georg Fischer
 */
public class A251367 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A251367() {
    super(1, new long[] {0, 695, 1289, -918},
      new long[] {1, -24, -49, 34});
  }
}
