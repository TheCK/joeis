package irvine.oeis.a223;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A223954 Number of 7 X n 0..1 arrays with diagonals and antidiagonals unimodal and rows nondecreasing.
 * @author Georg Fischer
 */
public class A223954 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A223954() {
    super(1, new long[] {0, 128, 1163, -7043, 11972, -3753, -9075, 7046, 2119, -1755, -2009, 
      1146, 346, -221},
      new long[] {1, -8, 28, -56, 70, -56, 28, -8, 1});
  }
}
