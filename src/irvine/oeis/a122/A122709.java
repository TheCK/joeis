package irvine.oeis.a122;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A122709 a(0)=1; thereafter a(n) = 9*n - 3.
 * @author Georg Fischer
 */
public class A122709 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A122709() {
    super(0, new long[] {1, 4, 4},
      new long[] {1, -2, 1});
  }
}
