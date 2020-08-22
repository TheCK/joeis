package irvine.oeis.a081;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A081598 Let n = 10x + y where 0 &lt;= y &lt;= 9, x &gt;= 0. Then a(n) = 7x+y.
 * @author Georg Fischer
 */
public class A081598 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A081598() {
    super(0, new long[] {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, -2},
      new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 1});
  }
}
