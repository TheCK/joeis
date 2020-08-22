package irvine.oeis.a140;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A140153 a(1)=1, a(n) = a(n-1) + n^3 if n odd, a(n) = a(n-1) + n^1 if n is even.
 * @author Georg Fischer
 */
public class A140153 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A140153() {
    super(1, new long[] {0, 1, 2, 23, -4, 23, 2, 1},
      new long[] {1, -1, -4, 4, 6, -6, -4, 4, 1, -1});
  }
}
