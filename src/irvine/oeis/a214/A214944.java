package irvine.oeis.a214;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A214944 Number of squarefree words of length 5 in an (n+1)-ary alphabet.
 * @author Georg Fischer
 */
public class A214944 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A214944() {
    super(1, new long[] {0, 0, 30, 84, 6},
      new long[] {1, -6, 15, -20, 15, -6, 1});
  }
}
