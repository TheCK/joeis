package irvine.oeis.a304;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A304506 a(n) = 2*(3*n+1)*(9*n+8).
 * @author Georg Fischer
 */
public class A304506 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A304506() {
    super(0, new long[] {16, 88, 4},
      new long[] {1, -3, 3, -1});
  }
}
