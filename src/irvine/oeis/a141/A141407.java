package irvine.oeis.a141;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A141407 a(n) = binomial(n+7,7)*6^n.
 * @author Georg Fischer
 */
public class A141407 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A141407() {
    super(0, new long[] {1},
      new long[] {1, -48, 1008, -12096, 90720, -435456, 1306368, -2239488, 1679616});
  }
}
