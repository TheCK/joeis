package irvine.oeis.a204;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A204695 a(n) = n^n (mod 9).
 * @author Georg Fischer
 */
public class A204695 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A204695() {
    super(0, new long[] {-1, -1, -4, 0, -4, -2, 0, -7, -1, 0, -1, -5, 0, -4, -7, 0, 
      -7, -8, 1},
      new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1});
  }
}
