package irvine.oeis.a322;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A322599 a(n) is the number of unlabeled rank-3 graded lattices with 4 coatoms and n atoms.
 * @author Georg Fischer
 */
public class A322599 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A322599() {
    super(1, new long[] {0, 1, 3, 8, 17, 21, 21, 16, 7, 3},
      new long[] {1, -1, -1, 0, 0, 2, 0, 0, -1, -1, 1});
  }
}
