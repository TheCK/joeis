package irvine.oeis.a111;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A111572 a(n) = a(n-1) + a(n-3) + a(n-4), n &gt;= 4.
 * @author Georg Fischer
 */
public class A111572 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A111572() {
    super(0, new long[] {1, -4, 1},
      new long[] {-1, 1, 0, 1, 1});
  }
}
