package irvine.oeis.a162;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A162466 a(n) = 12*a(n-2) for n &gt; 2; a(1) = 1, a(2) = 8.
 * @author Georg Fischer
 */
public class A162466 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A162466() {
    super(1, new long[] {0, 1, 8},
      new long[] {1, 0, -12});
  }
}
