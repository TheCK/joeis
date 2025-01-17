package irvine.oeis.a298;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A298682 Start with the triangle with 4 markings of the Shield tiling and recursively apply the substitution rule. a(n) is the number of triangles with 4 markings after n iterations.
 * @author Georg Fischer
 */
public class A298682 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A298682() {
    super(0, new long[] {1, -1, -7, -5},
      new long[] {1, -3, -5, 9, -2});
  }
}
