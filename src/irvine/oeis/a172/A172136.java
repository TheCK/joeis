package irvine.oeis.a172;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A172136 Number of ways to place 5 nonattacking knights on an n X n board.
 * @author Georg Fischer
 */
public class A172136 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A172136() {
    super(1, new long[] {0, 0, 0, -2, -318, -5756, -12704, -36886, 30042, -2000, -23368, 
      64952, -84860, 59900, -22664, 2092, 2220, -1036, 148},
      new long[] {-1, 11, -55, 165, -330, 462, -462, 330, -165, 55, -11, 1});
  }
}
