package irvine.oeis.a137;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A137215 a(n) = 3*(10^n) + (n*n+1)*((10^n)-1)/9.
 * @author Georg Fischer
 */
public class A137215 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A137215() {
    super(0, new long[] {3, -67, 478, -1002, 850, -100},
      new long[] {1, -33, 393, -1991, 3930, -3300, 1000});
  }
}
