package irvine.oeis.a108;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A108678 a(n) = (n+1)^2*(n+2)(2n+3)/6.
 * @author Georg Fischer
 */
public class A108678 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A108678() {
    super(0, new long[] {1, 5, 2},
      new long[] {1, -5, 10, -10, 5, -1});
  }
}
