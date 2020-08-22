package irvine.oeis.a094;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A094828 Number of (s(0), s(1), ..., s(2n)) such that 0 &lt; s(i) &lt; 9 and |s(i) - s(i-1)| = 1 for i = 1,2,....,2n, s(0) = 1, s(2n) = 5.
 * @author Georg Fischer
 */
public class A094828 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A094828() {
    super(2, new long[] {0, 0, -1, 2},
      new long[] {-1, 7, -15, 10, -1});
  }
}
