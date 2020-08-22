package irvine.oeis.a204;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A204624 Number of (n+1) X 3 0..2 arrays with every 2 X 2 subblock having unequal diagonal elements or unequal antidiagonal elements, and new values 0..2 introduced in row major order.
 * @author Georg Fischer
 */
public class A204624 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A204624() {
    super(1, new long[] {0, 96, -63},
      new long[] {1, -22, 14});
  }
}
