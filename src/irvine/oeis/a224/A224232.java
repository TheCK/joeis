package irvine.oeis.a224;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A224232 a(n) = n! if n &lt;= 3, otherwise a(n) = 2*(a(n-1)+a(n-3))+a(n-2).
 * @author Georg Fischer
 */
public class A224232 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A224232() {
    super(0, new long[] {-1, 1, 1, 1},
      new long[] {-1, 2, 1, 2});
  }
}
