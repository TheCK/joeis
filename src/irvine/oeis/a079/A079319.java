package irvine.oeis.a079;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A079319 a(0) = 1; for n &gt; 1, a(n) = 4*a(n-1) - (2^n-1).
 * @author Georg Fischer
 */
public class A079319 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A079319() {
    super(0, new long[] {1, -4, 2},
      new long[] {1, -7, 14, -8});
  }
}
