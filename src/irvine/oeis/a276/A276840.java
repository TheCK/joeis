package irvine.oeis.a276;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A276840 Number of permutations of [n] such that for each cycle c the smallest integer interval containing all elements of c has at most six elements.
 * @author Georg Fischer
 */
public class A276840 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A276840() {
    super(0, new long[] {1, 0, -2, -8, -12, 8, -42, -28, -2, 142, 8, 4, 120, 102, -40, 
      4, -60, -22, 44, 2, -2, 0, -1},
      new long[] {1, -1, -3, -9, -15, -37, -449, -639, -523, 1037, 3425, 5578, 4666, 
      6174, 2866, -12790, -32910, -12018, 11266, 1258, -13502, -8178, -947, 
      655, 2109, -977, -2227, -461, 59, -19, 9, 9, 1});
  }
}
