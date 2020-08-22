package irvine.oeis.a272;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A272066 a(n) = (10^n-1)^3.
 * @author Georg Fischer
 */
public class A272066 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A272066() {
    super(0, new long[] {0, 729, 160380, 729000},
      new long[] {1, -1111, 112110, -1111000, 1000000});
  }
}
