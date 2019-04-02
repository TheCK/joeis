package irvine.oeis.a285;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A285396 Start with a single cell at coordinates (0, 0, 0), then iteratively subdivide the grid into 3 X 3 X 3 cells and remove the cells whose sum of modulo 2 coordinates is 2; a(n) is the number of cells after n iterations. 
 * @author Georg Fischer
 */
public class A285396 extends LinearRecurrence {

  /** Construct the sequence. */
  public A285396() {
    super(new long[] {324L, -195L, 28L}, new long[] {1L, 21L, 399L});
  } // constructor()
} // A285396
