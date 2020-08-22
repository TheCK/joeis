package irvine.oeis.a289;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A289321 a(n) = Sum_{k &gt;= 0}(-1)^k*binomial(n,5*k+1).
 * @author Georg Fischer
 */
public class A289321 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A289321() {
    super(0, new long[] {0, -1, 3, -3, 1},
      new long[] {-1, 5, -10, 10, -5});
  }
}
