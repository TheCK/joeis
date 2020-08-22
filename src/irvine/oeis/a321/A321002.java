package irvine.oeis.a321;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A321002 a(0)=3; thereafter a(n) = 20*6^(n-1)-2^(n-1).
 * @author Georg Fischer
 */
public class A321002 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A321002() {
    super(0, new long[] {3, -5, 2},
      new long[] {1, -8, 12});
  }
}
