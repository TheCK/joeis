package irvine.oeis.a304;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A304617 a(n) = 324*n^2 - 564*n + 321 (n&gt;=1).
 * @author Georg Fischer
 */
public class A304617 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A304617() {
    super(1, new long[] {0, 81, 246, 321},
      new long[] {1, -3, 3, -1});
  }
}
