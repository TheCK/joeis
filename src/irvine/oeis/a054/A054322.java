package irvine.oeis.a054;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A054322 Fourth unsigned column of Lanczos triangle A053125 (decreasing powers).
 * @author Georg Fischer
 */
public class A054322 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A054322() {
    super(0, new long[] {4, 16},
      new long[] {1, -16, 96, -256, 256});
  }
}
