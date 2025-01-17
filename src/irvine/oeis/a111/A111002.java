package irvine.oeis.a111;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A111002 a(n) = gcd(f(n), f(n+1)) where f(n) = n^4 + n^2 + 1.
 * @author Georg Fischer
 */
public class A111002 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A111002() {
    super(0, new long[] {-1, -3, -7, -91, -21, -31, -43, -54, -64, -70, -504, -70, -64, 
      -54, -43, -31, -21, -91, -7, -3, -1},
      new long[] {-1, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 
      0, 0, 0, 1});
  }
}
