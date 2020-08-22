package irvine.oeis.a305;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A305412 a(n) = F(n)*F(n+1) + F(n+2), where F = A000045 (Fibonacci numbers).
 * @author Georg Fischer
 */
public class A305412 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A305412() {
    super(0, new long[] {1, 0, -5, -2, 1},
      new long[] {1, -3, -1, 5, 1, -1});
  }
}
