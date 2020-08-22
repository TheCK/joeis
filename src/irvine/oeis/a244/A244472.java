package irvine.oeis.a244;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A244472 2nd-largest term in n-th row of Stern's diatomic triangle A002487.
 * @author Georg Fischer
 */
public class A244472 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A244472() {
    super(1, new long[] {0, -1, -1, -1, -1, -1},
      new long[] {-1, 1, 1});
  }
}
