package irvine.oeis.a115;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A115108 Expansion of -(9520*x^9 -11504*x^8 +2840*x^7 -1040*x^6 +248*x^5 +36*x^4 -1) / ((2*x -1)*(4*x^2 +2*x -1)).
 * @author Georg Fischer
 */
public class A115108 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A115108() {
    super(0, new long[] {1, 0, 0, 0, -36, -248, 1040, -2840, 11504, -9520},
      new long[] {1, -4, 0, 8});
  }
}
