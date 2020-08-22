package irvine.oeis.a168;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A168107 a(n) = sum of natural numbers m such that n - 8 &lt;= m &lt;= n + 8.
 * @author Georg Fischer
 */
public class A168107 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A168107() {
    super(0, new long[] {36, -63, 28, 0, 0, 0, 0, 0, 0, 0, -1},
      new long[] {1, -3, 3, -1});
  }
}
