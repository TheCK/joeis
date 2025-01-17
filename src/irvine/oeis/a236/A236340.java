package irvine.oeis.a236;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A236340 Number of length n binary words such that maximal runs of 1's are restricted to length one or two and maximal runs of 0's are of odd length.
 * @author Georg Fischer
 */
public class A236340 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A236340() {
    super(0, new long[] {1, 2, 1, 0, -1},
      new long[] {1, 0, -2, -1});
  }
}
