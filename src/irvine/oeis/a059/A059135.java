package irvine.oeis.a059;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A059135 A hierarchical sequence (S(W2{3}c) - see A059126).
 * @author Georg Fischer
 */
public class A059135 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A059135() {
    super(0, new long[] {-11, -10},
      new long[] {-1, 4, -5, 2});
  }
}
