package irvine.oeis.a128;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A128424 a(n) = floor(sqrt(a(n-1)^2 + a(n-2)^2 + a(n-1)*a(n-2))), a(1)=1, a(2)=3.
 * @author Georg Fischer
 */
public class A128424 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A128424() {
    super(1, new long[] {0, 1, 1, -2, 1, -2, 1, -1},
      new long[] {1, -2, 1, -1, 1});
  }
}
