package irvine.oeis.a183;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A183430 One third the number of n X 2 0..3 arrays with no element equal to its row sum plus its column sum mod 4.
 * @author Georg Fischer
 */
public class A183430 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A183430() {
    super(1, new long[] {0, 4, -9, -3},
      new long[] {1, -9, -1, 9});
  }
}
