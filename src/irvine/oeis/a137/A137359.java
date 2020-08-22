package irvine.oeis.a137;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A137359 a(n) = Sum_{k &lt;= n/2 } k*binomial(n-2k, 3k).
 * @author Georg Fischer
 */
public class A137359 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A137359() {
    super(0, new long[] {0, 0, 0, 0, 0, 1, -2, 1},
      new long[] {1, -6, 15, -20, 15, -8, 7, -6, 2, 0, 1});
  }
}
