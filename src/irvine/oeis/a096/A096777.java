package irvine.oeis.a096;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A096777 a(n) = a(n-1) + Sum_{k=1..n-1}(a(k) mod 2), a(1) = 1.
 * @author Georg Fischer
 */
public class A096777 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A096777() {
    super(1, new long[] {0, -1, 0, 0, 0, -1},
      new long[] {-1, 2, -1, 1, -2, 1});
  }
}
