package irvine.oeis.a054;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A054343 Number of nonnegative integer 3 X 3 matrices with sum of elements equal to n, under action of dihedral group of the square D_4.
 * @author Georg Fischer
 */
public class A054343 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A054343() {
    super(0, new long[] {1, -2, 4, 0, 1, 2, 2},
      new long[] {1, -5, 8, 0, -16, 24, -16, -8, 34, -34, 8, 16, -24, 16, 0, 
      -8, 5, -1});
  }
}
