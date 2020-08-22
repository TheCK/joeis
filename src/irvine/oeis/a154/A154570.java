package irvine.oeis.a154;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A154570 The main diagonal of the successive differences of A154127.
 * @author Georg Fischer
 */
public class A154570 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A154570() {
    super(0, new long[] {1, 2, -9},
      new long[] {1, -1, -2});
  }
}
