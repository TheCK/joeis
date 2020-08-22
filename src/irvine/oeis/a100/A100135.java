package irvine.oeis.a100;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A100135 Sum C(n-3k,3k)2^k, k=0..floor(n/6).
 * @author Georg Fischer
 */
public class A100135 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A100135() {
    super(0, new long[] {1, -2, 1},
      new long[] {1, -3, 3, -1, 0, 0, -2});
  }
}
