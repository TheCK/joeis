package irvine.oeis.a105;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A105944 C(n+8,n)*C(n+11,8).
 * @author Georg Fischer
 */
public class A105944 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A105944() {
    super(0, new long[] {-165, -1650, -4620, -4620, -1650, -165},
      new long[] {-1, 17, -136, 680, -2380, 6188, -12376, 19448, -24310, 24310, -19448, 
      12376, -6188, 2380, -680, 136, -17, 1});
  }
}
