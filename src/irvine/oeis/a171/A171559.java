package irvine.oeis.a171;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A171559 Powers of 2 (cf. A000079) with 1 replaced by 3.
 * @author Georg Fischer
 */
public class A171559 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A171559() {
    super(0, new long[] {3, -4},
      new long[] {1, -2});
  }
}
