package irvine.oeis.a107;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A107386 a(n) = 2*a(n-1) - 2*a(n-3) + a(n-4), n&gt;6.
 * @author Georg Fischer
 */
public class A107386 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A107386() {
    super(0, new long[] {0, -1, 1, 0, 0, -4, 2},
      new long[] {-1, 2, 0, -2, 1});
  }
}
