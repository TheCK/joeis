package irvine.oeis.a183;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A183628 Number of (n+1)X6 0..2 arrays with every 2x2 subblock summing to 4.
 * @author Georg Fischer
 */
public class A183628 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A183628() {
    super(1, new long[] {0, 859, -4029, 4374},
      new long[] {1, -6, 11, -6});
  }
}
