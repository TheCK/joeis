package irvine.oeis.a229;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A229093 The clubs patterns appearing in n X n coins.
 * @author Georg Fischer
 */
public class A229093 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A229093() {
    super(0, new long[] {0, 0, -1, 0, -1, 1, -1, 1, -2, 1},
      new long[] {-1, 2, -1, 1, -2, 1});
  }
}
