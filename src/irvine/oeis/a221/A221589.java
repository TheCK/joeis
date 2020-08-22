package irvine.oeis.a221;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A221589 Equals one maps: number of n X 4 binary arrays indicating the locations of corresponding elements equal to exactly one of their king-move neighbors in a random 0..3 n X 4 array.
 * @author Georg Fischer
 */
public class A221589 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A221589() {
    super(1, new long[] {0, 8, 20, 672, 644, -2066, -736},
      new long[] {1, -20, 64});
  }
}
