package irvine.oeis.a152;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A152166 a(2*n) = 2^n; a(2*n+1) = -(2^(n+1)).
 * @author Georg Fischer
 */
public class A152166 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A152166() {
    super(0, new long[] {1, -2},
      new long[] {1, 0, -2});
  }
}
