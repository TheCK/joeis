package irvine.oeis.a209;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A209594 Number of 3 X 3 0..n arrays with every element equal to a diagonal or antidiagonal reflection.
 * @author Georg Fischer
 */
public class A209594 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A209594() {
    super(1, new long[] {0, 192, 2109, 4888, 2557, 352, -25, 8, -1},
      new long[] {1, -8, 28, -56, 70, -56, 28, -8, 1});
  }
}
