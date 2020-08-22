package irvine.oeis.a321;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A321003 a(n) = 2^n*(4*3^n-1).
 * @author Georg Fischer
 */
public class A321003 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A321003() {
    super(0, new long[] {3, -2},
      new long[] {1, -8, 12});
  }
}
