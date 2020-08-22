package irvine.oeis.a133;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A133953 A second integer solution:d=2;h=1; A 4 X 4 vector Markov of a game matrix MA and an anti- game matrix MB such that game_valueMa+game_ValueMB =0 and the score is the sum of the vector out put of the Markov: MA={{0,1},{1,d}}; MB={{1/h,0},(2 - d + 1/h + h),h}}; Characteristic Polynomial is: -1 + 4 x^2 - 4 x^3 + x^4.
 * @author Georg Fischer
 */
public class A133953 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A133953() {
    super(1, new long[] {0, 2, -2, -4},
      new long[] {1, -4, 4, 0, -1});
  }
}
