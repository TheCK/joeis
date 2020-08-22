package irvine.oeis.a304;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A304377 a(n) = 102*2^n - 96 (n&gt;=1).
 * @author Georg Fischer
 */
public class A304377 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A304377() {
    super(1, new long[] {0, 108, -12},
      new long[] {1, -3, 2});
  }
}
