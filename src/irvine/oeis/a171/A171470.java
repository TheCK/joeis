package irvine.oeis.a171;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A171470 a(n) = 6*a(n-1) - 8*a(n-2) for n &gt; 2; a(0) = 11, a(1) = 90, a(2) = 372.
 * @author Georg Fischer
 */
public class A171470 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A171470() {
    super(0, new long[] {11, 24, -80},
      new long[] {1, -6, 8});
  }
}
