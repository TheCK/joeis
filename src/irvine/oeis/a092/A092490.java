package irvine.oeis.a092;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A092490 a(n) = A058094(n) - 3*A058094(n-1) + A058094(n-2) for n &gt;=4.
 * @author Georg Fischer
 */
public class A092490 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A092490() {
    super(1, new long[] {0, 0, 0, 0, -1, 1, -1, -1},
      new long[] {-1, 6, -11, 9, -4, -4, 1});
  }
}
