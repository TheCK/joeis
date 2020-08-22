package irvine.oeis.a202;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A202456 Number of (n+2) X 5 binary arrays with consecutive windows of three bits considered as a binary number nondecreasing in every row and column.
 * @author Georg Fischer
 */
public class A202456 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A202456() {
    super(1, new long[] {0, 1000, -4124, 7106, -6297, 2838, -517},
      new long[] {1, -6, 15, -20, 15, -6, 1});
  }
}
