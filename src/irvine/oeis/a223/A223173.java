package irvine.oeis.a223;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A223173 Poly-Cauchy numbers c_3^(-n).
 * @author Georg Fischer
 */
public class A223173 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A223173() {
    super(1, new long[] {0, 1, -6},
      new long[] {-1, 9, -26, 24});
  }
}
