package irvine.oeis.a027;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A027775 a(n) = (n+1)*binomial(n+1, 15).
 * @author Georg Fischer
 */
public class A027775 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A027775() {
    super(14, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15, 1},
      new long[] {1, -17, 136, -680, 2380, -6188, 12376, -19448, 24310, -24310, 19448, 
      -12376, 6188, -2380, 680, -136, 17, -1});
  }
}
