package irvine.oeis.a250;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A250391 Number of length 5+3 0..n arrays with no four consecutive terms having the maximum of any two terms equal to the minimum of the remaining two terms.
 * @author Georg Fischer
 */
public class A250391 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A250391() {
    super(1, new long[] {0, 6, 460, 5070, 15078, 14644, 4670, 392},
      new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9, -1});
  }
}
