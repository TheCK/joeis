package irvine.oeis.a234;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A234133 Number of (n+1) X (1+1) 0..3 arrays with every 2 X 2 subblock having the sum of the absolute values of all six edge and diagonal differences equal to 9.
 * @author Georg Fischer
 */
public class A234133 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A234133() {
    super(1, new long[] {0, 32, 16, -224},
      new long[] {1, -2, -8, 16});
  }
}
