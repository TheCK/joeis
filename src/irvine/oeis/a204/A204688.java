package irvine.oeis.a204;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A204688 a(n) = n^n (mod 3).
 * @author Georg Fischer
 */
public class A204688 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A204688() {
    super(0, new long[] {1, 1, 1, 0, 1, 2, -1},
      new long[] {1, 0, 0, 0, 0, 0, -1});
  }
}
