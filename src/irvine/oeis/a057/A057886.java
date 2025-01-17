package irvine.oeis.a057;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A057886 Number of integer 4-tuples that give the lengths of the sides of a nondegenerate quadrilateral with perimeter n.
 * @author Georg Fischer
 */
public class A057886 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A057886() {
    super(1, new long[] {0, 0, 0, 0, 1, 0, -1, 1},
      new long[] {1, -1, -2, 2, 0, 0, 2, -2, -1, 1});
  }
}
