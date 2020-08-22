package irvine.oeis.a279;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A279115 Number of non-equivalent ways to place 6 non-attacking kings on an n X n board.
 * @author Georg Fischer
 */
public class A279115 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A279115() {
    super(1, new long[] {0, 0, 0, 0, 0, 143, 6997, 107325, 651585, 2086471, 3732434, 3669293, 
      1297859, -708745, -592136, 247421, 258649, -53671, -77714, 4451, 14969, 
      1018, -1741, -234, 106},
      new long[] {1, -6, 8, 22, -69, 8, 176, -168, -182, 364, 0, -364, 182, 168, 
      -176, -8, 69, -22, -8, 6, -1});
  }
}
