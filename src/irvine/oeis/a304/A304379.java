package irvine.oeis.a304;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A304379 a(n) = 256n^2 - 828n + 656 (n&gt;=1).
 * @author Georg Fischer
 */
public class A304379 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A304379() {
    super(1, new long[] {0, 84, -228, 656},
      new long[] {1, -3, 3, -1});
  }
}
