package irvine.oeis.a323;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A323824 a(0) = 6; thereafter a(n) = 4*a(n-1) + 1.
 * @author Georg Fischer
 */
public class A323824 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A323824() {
    super(0, new long[] {6, -5},
      new long[] {1, -5, 4});
  }
}
