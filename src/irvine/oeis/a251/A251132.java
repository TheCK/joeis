package irvine.oeis.a251;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A251132 Number of (n+1) X (3+1) 0..2 arrays with no 2 X 2 subblock having the sum of its diagonal elements greater than the maximum of its antidiagonal elements.
 * @author Georg Fischer
 */
public class A251132 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A251132() {
    super(1, new long[] {0, 369, -1212, 782, 1464, -2514, 1146, 62, -114, -5, 2},
      new long[] {1, -6, 13, -10, -5, 14, -9, 2});
  }
}
