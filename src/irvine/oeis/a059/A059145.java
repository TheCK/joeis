package irvine.oeis.a059;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A059145 A hierarchical sequence (S(W3{2,2}*cc) - see A059126).
 * @author Georg Fischer
 */
public class A059145 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A059145() {
    super(0, new long[] {-15, 6},
      new long[] {-1, 4, -5, 2});
  }
}
