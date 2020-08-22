package irvine.oeis.a136;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A136326 a(n) = a(n-1) + 4a(n-2) - 4a(n-3).
 * @author Georg Fischer
 */
public class A136326 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A136326() {
    super(0, new long[] {1, 1, -2, 1},
      new long[] {1, -1, -4, 4});
  }
}
