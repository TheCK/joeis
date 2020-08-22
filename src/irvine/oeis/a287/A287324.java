package irvine.oeis.a287;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A287324 a(n) = A008412(n-1) + A008412(n-2) for n&gt;1, a(0)=0, a(1)=1.
 * @author Georg Fischer
 */
public class A287324 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A287324() {
    super(0, new long[] {0, 1, 5, 10, 10, 5, 1},
      new long[] {1, -4, 6, -4, 1});
  }
}
