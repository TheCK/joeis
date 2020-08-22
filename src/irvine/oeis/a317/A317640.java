package irvine.oeis.a317;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A317640 The 7x+-1 function: a(n) = 7n+1 if n == +1 (mod 4), a(n) = 7n-1 if n == -1 (mod 4), otherwise a(n) = n/2.
 * @author Georg Fischer
 */
public class A317640 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A317640() {
    super(0, new long[] {0, 8, 1, 12, 1, 8},
      new long[] {1, 0, -1, 0, -1, 0, 1});
  }
}
