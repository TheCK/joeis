package irvine.oeis.a081;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A081654 a(n) = 2*4^n - 0^n.
 * @author Georg Fischer
 */
public class A081654 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A081654() {
    super(0, new long[] {1, 4},
      new long[] {1, -4});
  }
}
