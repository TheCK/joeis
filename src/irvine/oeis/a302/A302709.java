package irvine.oeis.a302;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A302709 a(n) = Trinomial(2*n+1, 4) = (1/6)*n*(2*n + 1)*(2*n^2 + 9*n + 1), n &gt;= 0.
 * @author Georg Fischer
 */
public class A302709 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A302709() {
    super(0, new long[] {0, 6, 15, -4, -1},
      new long[] {1, -5, 10, -10, 5, -1});
  }
}
