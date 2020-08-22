package irvine.oeis.a056;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A056589 Third column sequence of unsigned triangle A056588.
 * @author Georg Fischer
 */
public class A056589 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A056589() {
    super(0, new long[] {1, -1, 1},
      new long[] {1, -5, 5, 7, -9, -3, 2});
  }
}
