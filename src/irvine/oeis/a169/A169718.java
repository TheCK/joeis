package irvine.oeis.a169;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A169718 Number of ways of making change for n cents using coins of 1, 5, 10, 25, 50 and 100 cents.
 * @author Georg Fischer
 */
public class A169718 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A169718() {
    super(0, new long[] {1},
      new long[] {1, -1, 0, 0, 0, -1, 1, 0, 0, 0, -1, 1, 0, 0, 0, 1, -1, 0, 
      0, 0, 0, 0, 0, 0, 0, -1, 1, 0, 0, 0, 1, -1, 0, 0, 0, 1, 
      -1, 0, 0, 0, -1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 1, 0, 0, 
      0, 1, -1, 0, 0, 0, 1, -1, 0, 0, 0, -1, 1, 0, 0, 0, 0, 0, 
      0, 0, 0, 1, -1, 0, 0, 0, -1, 1, 0, 0, 0, -1, 1, 0, 0, 0, 
      1, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 1, 0, 0, 0, 1, -1, 0, 
      0, 0, 1, -1, 0, 0, 0, -1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 
      -1, 0, 0, 0, -1, 1, 0, 0, 0, -1, 1, 0, 0, 0, 1, -1, 0, 0, 
      0, 0, 0, 0, 0, 0, 1, -1, 0, 0, 0, -1, 1, 0, 0, 0, -1, 1, 
      0, 0, 0, 1, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 1, 0, 0, 0, 
      1, -1, 0, 0, 0, 1, -1, 0, 0, 0, -1, 1});
  }
}
