package irvine.oeis.a224;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A224160 Number of 4 X n 0..1 arrays with diagonals and rows unimodal and antidiagonals nondecreasing.
 * @author Georg Fischer
 */
public class A224160 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A224160() {
    super(1, new long[] {0, 16, -36, -115, 589, -950, 519, 442, -977, 817, -436, 178, -55, 
      9},
      new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9, -1});
  }
}
