package irvine.oeis.a192;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A192234 a(n) = 2*(a(n-1) + a(n-2) + a(n-3)) - a(n-4) for n &gt;= 4, with initial terms 0,1,0,1.
 * @author Georg Fischer
 */
public class A192234 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A192234() {
    super(0, new long[] {0, 1, -2, -1},
      new long[] {1, -2, -2, -2, 1});
  }
}
