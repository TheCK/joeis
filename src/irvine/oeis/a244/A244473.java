package irvine.oeis.a244;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A244473 3rd-largest term in n-th row of Stern's diatomic triangle A002487.
 * @author Georg Fischer
 */
public class A244473 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A244473() {
    super(2, new long[] {0, 0, -1, -2, -1, -3, -2, -1, -1, -1},
      new long[] {-1, 1, 1});
  }
}
