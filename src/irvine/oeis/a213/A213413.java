package irvine.oeis.a213;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A213413 Half the number of n X 3 binary arrays with no 3 X 3 submatrix formed with any three rows and columns equal to J-I.
 * @author Georg Fischer
 */
public class A213413 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A213413() {
    super(1, new long[] {0, 4, -40, 105},
      new long[] {1, -18, 107, -210});
  }
}
