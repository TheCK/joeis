package irvine.oeis.a059;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A059598 Tenth column (m=9) of convolution triangle A059594(n,m).
 * @author Georg Fischer
 */
public class A059598 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A059598() {
    super(0, new long[] {1},
      new long[] {1, -10, 35, -20, -195, 498, 15, -1800, 2205, 2150, -7001, 2260, 
      9785, -10830, -4845, 15504, -4845, -10830, 9785, 2260, -7001, 2150, 
      2205, -1800, 15, 498, -195, -20, 35, -10, 1});
  }
}
