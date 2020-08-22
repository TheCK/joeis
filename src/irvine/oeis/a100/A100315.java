package irvine.oeis.a100;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A100315 Number of 3 X n 0-1 matrices avoiding simultaneously the right angled numbered polyomino patterns (ranpp) (00;1), (01;0), (10;0) and (01;1).
 * @author Georg Fischer
 */
public class A100315 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A100315() {
    super(0, new long[] {1, 4, -13, 4},
      new long[] {1, -4, 5, -2});
  }
}
