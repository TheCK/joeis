package irvine.oeis.a097;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A097039 a(n) = Sum_{i=0..n} i*L(i), where L = A000032.
 * @author Georg Fischer
 */
public class A097039 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A097039() {
    super(0, new long[] {0, -1, -4, 1},
      new long[] {-1, 3, -1, -3, 1, 1});
  }
}
