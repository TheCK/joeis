package irvine.oeis.a285;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A285400 Start with a single cell at coordinates (0, 0, 0), then iteratively subdivide the grid into 3 X 3 X 3 cells and remove the cells whose sum of modulo 2 coordinates is 0 or 3; a(n) is the number of cells after n iterations.
 * @author Georg Fischer
 */
public class A285400 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A285400() {
    super(0, new long[] {1, -3},
      new long[] {1, -21});
  }
}
