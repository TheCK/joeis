package irvine.oeis.a147;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A147597 a(n) is the number whose binary representation is A138146(n).
 * @author Georg Fischer
 */
public class A147597 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A147597() {
    super(1, new long[] {0, -1, -2, 0, 8, 16},
      new long[] {-1, 5, -4});
  }
}
