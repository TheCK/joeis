package irvine.oeis.a161;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A161583 The list of the k values in the common solutions to the 2 equations 15*k+1=A^2, 19*k+1=B^2.
 * @author Georg Fischer
 */
public class A161583 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A161583() {
    super(1, new long[] {0, 0, -17},
      new long[] {-1, 288, -288, 1});
  }
}
