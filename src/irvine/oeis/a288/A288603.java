package irvine.oeis.a288;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A288603 a(n) = 2*a(n-1) - a(n-3) for n &gt;= 3, where a(0) = 2, a(1) = 4, a(2) = 6, a(3) = 8.
 * @author Georg Fischer
 */
public class A288603 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A288603() {
    super(0, new long[] {2, 0, -2, -2},
      new long[] {1, -2, 0, 1});
  }
}
