package irvine.oeis.a293;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A293344 a(n) = a(n-1) + a(n-3) + 2*a(n-5) - a(n-8) - a(n-10), n &gt; 10.
 * @author Georg Fischer
 */
public class A293344 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A293344() {
    super(1, new long[] {0, 1, 0, 3, 0, 10, 0, 0, -8, 0, -10},
      new long[] {1, -1, 0, -1, 0, -2, 0, 0, 1, 0, 1});
  }
}
