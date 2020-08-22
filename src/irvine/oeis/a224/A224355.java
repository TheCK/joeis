package irvine.oeis.a224;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A224355 Number of 4 X n 0..2 arrays with diagonals and antidiagonals unimodal and rows nondecreasing.
 * @author Georg Fischer
 */
public class A224355 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A224355() {
    super(1, new long[] {0, 81, 567, -2868, 6540, -6063, -415, 7550, -8564, 4918, -1584, 
      262, -14},
      new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9, -1});
  }
}
